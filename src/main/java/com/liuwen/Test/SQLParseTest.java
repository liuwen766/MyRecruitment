package com.liuwen.Test;

import com.alibaba.druid.sql.SQLUtils;
import com.alibaba.druid.sql.ast.statement.SQLSelect;  
import com.alibaba.druid.sql.ast.statement.SQLSelectItem;  
import com.alibaba.druid.sql.ast.statement.SQLSelectQueryBlock;  
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;  
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;  
import com.alibaba.druid.sql.visitor.SQLASTOutputVisitor;  
import com.alibaba.druid.util.JdbcUtils;  
  
public class SQLParseTest {  
  
    public static void main(String args[]){  
        String sql = " select eventId,eventKey,eventName,flag from event where eventId = ? and eventKey = ? and eventName = ?";  
        //使用mysql解析  
        MySqlStatementParser sqlStatementParser = new MySqlStatementParser(sql) ;  
        //解析select查询  
        SQLSelectStatement sqlStatement = (SQLSelectStatement) sqlStatementParser.parseSelect();
        SQLSelect sqlSelect = sqlStatement.getSelect() ;  
        //获取sql查询块  
        SQLSelectQueryBlock sqlSelectQuery = (SQLSelectQueryBlock)sqlSelect.getQuery() ;  
  
        StringBuffer out = new StringBuffer() ;  
        //创建sql解析的标准化输出  
        SQLASTOutputVisitor sqlastOutputVisitor = SQLUtils.createFormatOutputVisitor(out , null , JdbcUtils.MYSQL) ;  
  
        //解析select项  
        out.delete(0, out.length()) ;  
        for (SQLSelectItem sqlSelectItem : sqlSelectQuery.getSelectList()) {  
            if(out.length()>1){  
                out.append(",") ;  
            }  
            sqlSelectItem.accept(sqlastOutputVisitor);  
        }  
        System.out.println("SELECT "+out) ;  
  
        //解析from  
        out.delete(0, out.length()) ;  
        sqlSelectQuery.getFrom().accept(sqlastOutputVisitor) ;  
        System.out.println("FROM "+out) ;  
  
        //解析where  
        out.delete(0, out.length()) ;  
        sqlSelectQuery.getWhere().accept(sqlastOutputVisitor) ;  
        System.out.println("WHERE "+out);  
  
    }  
  
}  