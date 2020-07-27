public class Array2DPrac
{
    public static void main (String [] args)
    {
        int[][] mat={{5,2,1},{9,3,4}};
        //display2DArray(mat);
        //display2DArrayCMO(mat);
        
        //Exercise 1
        double avg=findAverage(mat);
        System.out.println(avg);
        System.out.println();
        
        //Exercise 2
        double[][] table= new double[36][45];
        for(int r=0; r<table.length;r++)
        {
            for(int c=0; c<table[0].length;c++)
            {
                table[r][c]=3.14;
            }
        }
        
        Array2DPrac.display2DArrayD(table);
        //Exercise 3a
        for(int c=0;c<table[0].length;c++)
        {
            table[1][c]+=10.1;
        }
        System.out.println();
        Array2DPrac.display2DArrayD(table);
        
        //Exercise 3b
        for(int r=0; r<table.length;r++)
        {
            table[r][2]=table[r][2]*-1;
        }
        System.out.println();
        display2DArrayD(table);
        System.out.println();
        
        //display2DArrayD(pie);
        
        //Exercise 4
        int[][] square= new int[5][5];
        for(int r=0; r<square.length;r++)
        {
            for(int c=0; c<square[0].length;c++)
            {
                square[r][c]=2;
            }
        }
        square[0][0]=-1;
        square[1][1]=-3;
        square[2][2]=-4;
        square[3][3]=-5;
        square[4][4]=-6;
        
        //4 test
        int[] diags=majorDiag(square);
        //displayArray(diags);
        
        //5 test
        int[] diags2=minorDiag(square);
        //displayArray(diags2);
        
        //Exercise 6
        int numNegs=countNegs(square);
        System.out.println(numNegs);
        
        //Exercise 7
        int[][] g ={{9, 8, 7, 6},           //THIS IS CORRECT SYNTAX
   	{5, 4, 2, 1},
   	{3, 9, 2, 3}};
        
        int[][] rowToCol=colMajorToRowMajor(g);
        display2DArray(rowToCol);
        
        
        
        

    }
    
    //Display array---------------------------------------------------------------------------------
    public static void displayArray(int[] a )
    {
        for(int i = 0; i<a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }
    public static void display2DArray(int[][] grid)
    {
        for(int r=0; r<grid.length;r++)
        {
            for(int c=0; c<grid[r].length;c++)
            {
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static void display2DArrayCMO(int[][] grid)
    {
        for(int c=0; c<grid[0].length;c++)
        {
            for(int r=0;r<grid.length;r++)
            {
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static void display2DArrayD(double[][] grid)
    {
        for(int r=0; r<grid.length;r++)
        {
            for(int c=0; c<grid[r].length;c++)
            {
                System.out.print(grid[r][c]+" ");
            }
            System.out.println();
        }
    }
    //-----------------------------------------------------------------------------------------------
    //Exercise 1
    public static double findAverage(int[][] a)
    {
        double total=0;
        int counter=0;
        
        //go row by row 
        for(int r=0; r<a.length;r++)
        {
            for(int c=0; c<a[0].length;c++)
            {
                total=total+a[r][c];
                counter++;
            }
        }
        return (total/counter);
    }
    
    //Exercise 4
    public static int[] majorDiag(int[][] mat)
    {
        int[] output= new int[mat.length];
        int c=0;
        int r=0;
        
        for(int i =0; i<mat.length; i++)
        {
            output[i]=mat[r][c];
            r++;
            c++;
        }
        
        return output;
    }
    //Exercise 5
    public static int[] minorDiag(int[][] mat)
    {
        int[] output= new int[mat.length];
        int c=mat[0].length-1;
        int r=0;
        
        for(int i=0; i<mat.length;i++)
        {
            output[i]=mat[r][c];
            r++;
            c--;
        }
        return output;
    }

    //Exercise 6
    public static int countNegs(int[][] mat)
    {
        int output=0;
        
        for(int r=0; r<mat.length;r++)
        {
            for(int c=0; c<mat[0].length;c++)
            {
                if(mat[r][c]<0)
                    output++;
            }
        }
        return output;
    }
    
    //Exercise 7  
    public static int[][] colMajorToRowMajor(int[][] mat)
    {
        int[][] output=new int[mat[0].length][mat.length];
        //      (1)
        for(int c=0; c<mat[0].length; c++)
        {
            for(int r=0; r<mat.length;r++)
            {
                output[c][r]=mat[r][c];
            }
        }
        return output;
    }
    /*
    More ways to do this question:
    
    Going through output in row major order
            (2)
    for(int r=0; r<output.length;r++)
    {
        for(int c=0; c<output[0].length;c++)
        {
            output[r][c]=mat[c][r];
        }
    }
    
            (3)
    Going through output in col major order
    
    for(int c=0; c<output[0].length; c++)
        {
            for(int r=0; r<output.length;r++)
            {
                output[r][c]=mat[c][r];
            }
        }
    
            (4)
    Going through mat in row major order
    
    for(int r=0; r<mat.length;r++)
    {
        for(int c=0; c<mat[0].length;c++)
        {
            output[c][r]=mat[r][c];
        }
    }
    */
    
    //Helper method for 8
    /*
    this method accepts a 2d array an a row and a column. 
    this method will return true if the row and column exist in the 2d array
    */
    public static boolean isValid(int[][] mat, int r, int c)
    {
        if(r>=0&&r<mat.length&&c>=0&&c<mat[0].length)
        {
            return true;
        }
        else 
            return false;
        
    }
            
    
    //Exercise 8
    public static int[][] posToNeg2D(int[][] mat, int row, int col)
    {   
        for(int r=row-1;r<=row+1;r++)
        {
            for(int c=col-1;c<=col+1;c++)
            {
                if(isValid(mat,r,c))
                {
                    if(r!=row||c!=col)
                    {
                        mat[r][c]*=-1;
                    }
                }
            }
        }
        return mat;
    }
    
    
    //Exercise 9
    public static int[] rowMajorOrder(int[][] nums)
    {
        int[] output= new int[nums.length*nums[0].length];
        int outputI=0;
        
        for(int r=0; r<nums.length;r++)
        {
            for(int c=0; c<nums[0].length;c++)
            {
                output[outputI]=nums[r][c];
                outputI++;
                
            }
        }
        
        return output;
    }
    
    //Exercise 10
    public static void rotateUp(int[][] g)
    {
        int[] temp=g[0];
        for(int r=1; r<g.length;r++)
        {
           g[r-1]=g[r];
        }
        g[g.length-1]=temp;
    }
    
}