package com.liuwen.五大算法题.回溯算法;

/**
 * ----------------------------------------------------------------------
 * 走迷宫
 *
 * @author Create by liu wen at 2021.4.26 19:35
 * <p>
 * ----------------------------------------------------------------------
 */
public class Maze {

    static int count = 0;

    public static void main(String[] args) {

        // 用二位数组来表示迷宫 0：表示没有走过 1：表示是墙 2：表示走过 3：表示走不通
        int[][] maze = acquireMaze();
        //打印一下获取的迷宫
        System.out.println("这是你要走的迷宫：");
        print(maze);
        //走迷宫
        boolean result = walkInMaze(maze, 1, 1);
//        boolean result = setWay(maze, 1, 1);
        if (result) {
            System.out.println("恭喜你，成功到达迷宫终点！");
            print(maze);
        } else {
            System.out.println("抱歉，到达不了终点！");
            print(maze);
        }
        //一共走了多少步
        System.out.println("一共走了多少步:"+count);


    }

    /**
     * 走迷宫
     * 在迷宫中， 0：表示没有走过 1：表示是墙 2：表示走过 3：表示走不通
     * 规定：左上角为起点，右下角为终点
     * 规定：定义一个策略，按照下→右→上→左的顺序走迷宫
     *
     * @param maze 表示迷宫的二位数组
     * @param s    起点横坐标
     * @param t    起点纵坐标
     * @return boolean
     * @date 9:30 2021.4.27
     */
    public static boolean walkInMaze(int[][] maze, int s, int t) {
        //当走到右下角的时候，说明成功
        if (maze[maze.length - 2][maze[0].length - 2] == 2) {
            return true;
        } else {
            //否则，开始走。当起点为0的时候，说明可以开始走了
            if (maze[s][t] == 0) {
                count++;
                maze[s][t] = 2;
                //向下走
                if (walkInMaze(maze, s + 1, t)) {
                    return true;
                    //向右走
                } else if (walkInMaze(maze, s, t + 1)) {
                    return true;
                    //向上走
                } else if (walkInMaze(maze, s - 1, t)) {
                    return true;
                    //向左走
                } else if (walkInMaze(maze, s, t - 1)) {
                    return true;
                    //无路可走
                } else {
                    maze[s][t] = 3;
                    return false;
                }
            } else {
                //起点不为0，说明可能是1，可能是2，可能是3，所以不能走了。
                return false;
            }
        }
    }


    /**
     * 获取一个迷宫  eg:一个8*10的迷宫
     *
     * @return int[][]
     * @date 23:42 2021.4.26
     */
    private static int[][] acquireMaze() {
        int[][] maze = new int[8][10];
        for (int i = 0; i < maze.length; i++) {
            maze[i][0] = 1;
            maze[i][maze[0].length - 1] = 1;
        }
        for (int i = 0; i < maze[0].length; i++) {
            maze[0][i] = 1;
            maze[maze.length - 1][i] = 1;
        }
        maze[3][1] = 1;
        maze[3][2] = 1;
        //封住迷宫
        maze[2][2] = 1;
        maze[1][2] = 1;
        return maze;
    }


//    public static boolean setWay(int[][] map, int i, int j) {
//        if (map[6][5] == 2) { // 通路已经找到ok
//            return true;
//        } else {
//            if (map[i][j] == 0) { //如果当前这个点还没有走过
//                //按照策略 下->右->上->左  走
//                map[i][j] = 2; // 假定该点是可以走通.
//                if (setWay(map, i + 1, j)) {//向下走
//                    return true;
//                } else if (setWay(map, i, j + 1)) { //向右走
//                    return true;
//                } else if (setWay(map, i - 1, j)) { //向上
//                    return true;
//                } else if (setWay(map, i, j - 1)) { // 向左走
//                    return true;
//                } else {
//                    //说明该点是走不通，是死路
//                    map[i][j] = 3;
//                    return false;
//                }
//            } else { // 如果map[i][j] != 0 , 可能是 1， 2， 3
//                return false;
//            }
//        }
//    }

    /**
     * 打印迷宫
     *
     * @param arr 传入一个表示迷宫的二维数组
     * @return void
     * @date 23:44 2021.4.26
     */
    private static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
