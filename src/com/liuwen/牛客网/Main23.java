package com.liuwen.牛客网;
import java.util.ArrayList;
/**
 * @description: 输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 *  如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 * @author: Liu Wen
 * @create: 2020-03-10 14:56
 **/
public class Main23 {
    public static void main(String[] args){
        int[] arr = {1,3,2,6,5,4};
        boolean result = VerifySquenceOfBST(arr);
        System.out.println(result);
    }
    /**
     * @Description: BST的后序序列的合法序列是，对于一个序列S，最后一个元素是x （也就是根），如果去掉最后一个元素的序列为T，那么T满足：T可以分成两段，前一段（左子树）小于x，后一段（右子树）大于x，
     * 且这两段（子树）都是合法的后序序列。完美的递归定义。
      * @param sequence
     * @return boolean
     * @date 20.3.10 15:02
     */
    public static boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length < 0) {
            return false;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < sequence.length; i++) {
            list.add(sequence[i]);
        }
        return VerifySeq(list);
    }
    private static boolean VerifySeq(ArrayList<Integer> sequence) {
        if(sequence.size()<1){
            return true;
        }
        int last = sequence.get(sequence.size()-1);
        //在二叉搜索树中左子树节点小于根节点
        int i = 0;
        ArrayList<Integer> arrayListLeft = new ArrayList<>();
        ArrayList<Integer> arrayListRight = new ArrayList<>();
        //找出左子树
        while (i<sequence.size()&&sequence.get(i)<last){
            arrayListLeft.add(sequence.get(i++));
        }
        //找出右子树
        while (i<sequence.size()&&sequence.get(i)>last){
            arrayListRight.add(sequence.get(i++));
        }
        //这里要用while，不能用if
        while ((arrayListLeft.size()+arrayListRight.size())<sequence.size()-1){
            return false;
        }
        // # 判断左子树是否为二叉搜索树
        int[] left = new int[arrayListLeft.size()];
        for (int j = 0; j < arrayListLeft.size(); j++) {
            left[j]=arrayListLeft.get(j);
        }
        // # 判断右子树是否为二叉搜索树
        int[] right = new int[arrayListRight.size()];
        for (int j = 0; j < arrayListRight.size(); j++) {
            right[j]=arrayListRight.get(j);
        }
        return VerifySquenceOfBST(left)&&VerifySquenceOfBST(right);
    }
}
