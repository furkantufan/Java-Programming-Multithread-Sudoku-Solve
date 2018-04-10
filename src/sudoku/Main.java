
package sudoku;

import java.awt.Component;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;

 public class Main {

     static int bak_satir = 0, bak_sutun = 0, sayac = 0;
     public static Thread thread1   = new Thread();
     public static Thread thread2   = new Thread();
     public static Thread thread3   = new Thread();
     public static Thread thread4   = new Thread();
     public static Sudoku olustur   = new Sudoku();
     public static SudokuFrame olustur2   = new SudokuFrame();
      static String gecici;
      public static long thread1_startTime;
      public static long thread2_startTime;
      public static long thread3_startTime;
      public static long thread4_startTime;
      static int gecici1;
    static String dizi[][]= new String[9][9];
    public static int[][] matris = new int[9][9];
     /*public static int[][] matris = new int[][]{
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
            {0,0,0,0,0,0,0,0,0},
                                };*/
    public static void fileselect() throws FileNotFoundException, IOException {
        System.out.println("---------- Cekilen Degerler ----------");
        
        JFileChooser choosefile = new JFileChooser();
         Component modalToComponent = null;
       if (choosefile.showOpenDialog(modalToComponent) == JFileChooser.APPROVE_OPTION) {
         File filereader = choosefile.getSelectedFile();
         //File file = new File("sudoku.txt");
        BufferedReader reader = null;
        reader = new BufferedReader(new FileReader(filereader));
        
        // load from file
         
        
        int bas=0, son=0,r=0;
        String deger=" ";
        String satir = reader.readLine();
 
            while (satir!=null) {
                //System.out.println(satir);
                
                bas=0;
                son=0;
                for(int i=0; i<9; i++){
                    son++;
                    deger=satir.substring(bas,son);
                    //System.out.print("-("+bas+","+son+"->"+deger);
                    if(deger.equals("*"))
                        deger="0"; 
                        
                     matris[r][i]=Integer.valueOf(deger);    
                    System.out.print(matris[r][i]+" ");
                    bas++;
                    
                }
                r++;
                System.out.println("");
                satir = reader.readLine();
            }
        
       }
             System.out.println("---------- bitti ----------");
    }
    
    public static void writeMatrix(int[][] solution) {// konsola tasarım
        for (int i = 0; i < 9; ++i) {
            if (i % 3 == 0) {
                System.out.println(" -----------------------");
            }
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0) {
                    System.out.print("| ");
                }
                System.out.print(solution[i][j] == 0
                        ? " "
                        : Integer.toString(solution[i][j]));

                System.out.print(' ');
                gecici1=solution[i][j];
              gecici=String.valueOf(gecici1);
              dizi[i][j]=gecici;
            }
            System.out.println("|");
        }
        System.out.println(" -----------------------");
    }

   /* public static int[][] matris = new int[][]{
            {0,0,0,0,4,0,0,0,0},
            {0,0,2,6,0,7,1,0,0},
            {8,7,1,0,0,0,6,9,4},
            {0,6,0,0,0,0,0,4,0},
            {2,0,5,9,0,6,7,0,8},
            {0,8,0,0,0,0,0,2,0},
            {6,5,8,0,0,0,4,7,1},
            {0,0,9,4,0,8,5,0,0},
            {0,0,0,0,7,0,0,0,0},
                                };*/
   
    
    /* public static int[][] matris = new int[][]{
            {5,3,0,0,7,0,0,0,0},
            {6,0,0,1,9,5,0,0,0},
            {0,9,8,0,0,0,0,6,0},
            {8,0,0,0,6,0,0,0,3},
            {4,0,0,8,0,3,0,0,1},
            {7,0,0,0,2,0,0,0,6},
            {0,6,0,0,0,0,2,8,0},
            {0,0,0,4,1,9,0,0,5},
            {0,0,0,0,8,0,0,7,9},
                                };*/
 
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
         olustur.setVisible(true);
         olustur2.setVisible(true);
       
        
        //fileselect();       
        
       {
   
        /*for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(matris[i][j]);

            }
            System.out.println();

        }
*/

      /*  for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {

                if (matris[i][j] == 0) {
                    bak_satir = i;
                    bak_sutun = j;
                    sayac = 25;
                    break;
                }
            }

            if (sayac == 25) {
                break;
            }
        }*/

    
    }

 
    
    
}

    static void olustur() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     Timer d = new Timer();
     
     public static void thread_create() {
     thread1 = new Thread(new Thread1("Thread-1", bak_satir, bak_sutun, matris));
     thread2 = new Thread(new Thread2("Thread-2", bak_satir, bak_sutun, matris));
     thread3 = new Thread(new Thread3("Thread-3", bak_satir, bak_sutun, matris));
     thread4 = new Thread(new Thread4("Thread-4", bak_satir, bak_sutun, matris));
     
     
     //thread1_startTime = System.currentTimeMillis();
     //thread1.start();
     
     // thread2_startTime = System.currentTimeMillis();
      //thread2.start();
     
      
     //thread3_startTime = System.currentTimeMillis();
      //thread3.start();
      
      //thread4_startTime = System.currentTimeMillis();
     // thread4.start();
      
     
    
        
   
     }
 
 
 
 }
