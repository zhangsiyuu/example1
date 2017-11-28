/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 吉彬
 */
public class Solution {
    public static void main(String[] args){
        
    }
    /*
    问题：
    在一个二维数组中，每一行都按照从左到右递增的顺序排序，
    每一列都按照从上到下递增的顺序排序。请完成一个函数，
    输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
    */
    
    /*
    解决思路：
    牛客链接：https://www.nowcoder.com/questionTerminal/abc3fe2ce8e146608e868a70efebf62e?toCommentId=1107078
    首先选取数组中右上角的数字，
    如果该数字等于要查找的数字，则查找过程结束；
    如果该数字大于要查找的数字，剔除这个数字所在的列；
    如果该数字小于要查找的数字，则剔除这个数字所在的行。
    也就是说如果要查找的数字不在数组右上角，
    则每一次都在数组的查找范围中剔除一行或者一列，
    这样每一步都可以缩小查找范围，直到找到要查找的数字，或者查找范围为空。
    */
    public boolean Find(int target, int [][] array) {
	int row = array.length-1;//总行数
        int col = array[0].length-1;//总列数
        boolean bool = false;
        for(int i = 0,j = col;i<=row&&j>=0;){
            if(array[i][j]==target){
                bool = true;
                break;
            }
            if(array[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return bool;
    }
}
