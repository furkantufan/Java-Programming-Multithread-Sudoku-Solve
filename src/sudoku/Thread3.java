package sudoku;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import static sudoku.SudokuFrame.sudoku00;
import static sudoku.SudokuFrame.sudoku01;
import static sudoku.SudokuFrame.sudoku02;
import static sudoku.SudokuFrame.sudoku03;
import static sudoku.SudokuFrame.sudoku04;
import static sudoku.SudokuFrame.sudoku05;
import static sudoku.SudokuFrame.sudoku06;
import static sudoku.SudokuFrame.sudoku07;
import static sudoku.SudokuFrame.sudoku08;
import static sudoku.SudokuFrame.sudoku10;
import static sudoku.SudokuFrame.sudoku11;
import static sudoku.SudokuFrame.sudoku12;
import static sudoku.SudokuFrame.sudoku13;
import static sudoku.SudokuFrame.sudoku14;
import static sudoku.SudokuFrame.sudoku15;
import static sudoku.SudokuFrame.sudoku16;
import static sudoku.SudokuFrame.sudoku17;
import static sudoku.SudokuFrame.sudoku18;
import static sudoku.SudokuFrame.sudoku20;
import static sudoku.SudokuFrame.sudoku21;
import static sudoku.SudokuFrame.sudoku22;
import static sudoku.SudokuFrame.sudoku23;
import static sudoku.SudokuFrame.sudoku24;
import static sudoku.SudokuFrame.sudoku25;
import static sudoku.SudokuFrame.sudoku26;
import static sudoku.SudokuFrame.sudoku27;
import static sudoku.SudokuFrame.sudoku28;
import static sudoku.SudokuFrame.sudoku30;
import static sudoku.SudokuFrame.sudoku31;
import static sudoku.SudokuFrame.sudoku32;
import static sudoku.SudokuFrame.sudoku33;
import static sudoku.SudokuFrame.sudoku34;
import static sudoku.SudokuFrame.sudoku35;
import static sudoku.SudokuFrame.sudoku36;
import static sudoku.SudokuFrame.sudoku37;
import static sudoku.SudokuFrame.sudoku38;
import static sudoku.SudokuFrame.sudoku40;
import static sudoku.SudokuFrame.sudoku41;
import static sudoku.SudokuFrame.sudoku42;
import static sudoku.SudokuFrame.sudoku43;
import static sudoku.SudokuFrame.sudoku44;
import static sudoku.SudokuFrame.sudoku45;
import static sudoku.SudokuFrame.sudoku46;
import static sudoku.SudokuFrame.sudoku47;
import static sudoku.SudokuFrame.sudoku48;
import static sudoku.SudokuFrame.sudoku50;
import static sudoku.SudokuFrame.sudoku51;
import static sudoku.SudokuFrame.sudoku52;
import static sudoku.SudokuFrame.sudoku53;
import static sudoku.SudokuFrame.sudoku54;
import static sudoku.SudokuFrame.sudoku55;
import static sudoku.SudokuFrame.sudoku56;
import static sudoku.SudokuFrame.sudoku57;
import static sudoku.SudokuFrame.sudoku58;
import static sudoku.SudokuFrame.sudoku60;
import static sudoku.SudokuFrame.sudoku61;
import static sudoku.SudokuFrame.sudoku62;
import static sudoku.SudokuFrame.sudoku63;
import static sudoku.SudokuFrame.sudoku64;
import static sudoku.SudokuFrame.sudoku65;
import static sudoku.SudokuFrame.sudoku66;
import static sudoku.SudokuFrame.sudoku67;
import static sudoku.SudokuFrame.sudoku68;
import static sudoku.SudokuFrame.sudoku70;
import static sudoku.SudokuFrame.sudoku71;
import static sudoku.SudokuFrame.sudoku72;
import static sudoku.SudokuFrame.sudoku73;
import static sudoku.SudokuFrame.sudoku74;
import static sudoku.SudokuFrame.sudoku75;
import static sudoku.SudokuFrame.sudoku76;
import static sudoku.SudokuFrame.sudoku77;
import static sudoku.SudokuFrame.sudoku78;
import static sudoku.SudokuFrame.sudoku80;
import static sudoku.SudokuFrame.sudoku81;
import static sudoku.SudokuFrame.sudoku82;
import static sudoku.SudokuFrame.sudoku83;
import static sudoku.SudokuFrame.sudoku84;
import static sudoku.SudokuFrame.sudoku85;
import static sudoku.SudokuFrame.sudoku86;
import static sudoku.SudokuFrame.sudoku87;
import static sudoku.SudokuFrame.sudoku88;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Thread3 implements Runnable {

    static void stop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int end;
    private String name;
    public int id;
    public static int[][] gelenmatris = new int[9][9];
    private Thread t;
    public static String threadName;
    private int satir;
    private int sutun;

     public static long thread3_endTime;
    public static long thread3_estimatedTime;
    public static double thread3_seconds;
    
    public Thread3(String name, int al_satir, int al_sutun, int[][] matrix) {
        //id = gelen_id;
        threadName = name;
        satir = al_satir;
        sutun = al_sutun;
//        gelenmatris = matrix.clone();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                gelenmatris[i][j] = matrix[i][j];

            }

        }
        System.out.println("Creating " + threadName + "--" + id);

    }

        public static void writeMatrix(int[][] solution) {// konsola tasarım
        
       
        
       // Sudoku.calis.setText(null);
        for (int i = 0; i < 9; ++i) {
            
            if (i % 3 == 0) {
                
            
   
             
                System.out.println(" -----------------------");
                 Sudoku.calis_ust3.setText(Sudoku.calis_ust3.getText()+"  -----------------------------------------------------\n");
            }
            for (int j = 0; j < 9; ++j) {
                if (j % 3 == 0) {
                    System.out.print("| ");
                    Sudoku.calis_ust3.setText(Sudoku.calis_ust3.getText()+"  |   ");
                }
             
                  Sudoku.calis_ust3.setText(Sudoku.calis_ust3.getText()+(solution[i][j] == 0?"0": Integer.toString(solution[i][j])));
                System.out.print(solution[i][j] == 0? " ": Integer.toString(solution[i][j]));

                System.out.print(' ');
                 Sudoku.calis_ust3.setText(Sudoku.calis_ust3.getText()+"   ");
                
              
            }
            System.out.println("| ");
             Sudoku.calis_ust3.setText(Sudoku.calis_ust3.getText()+"  |  \n");
        }
        Sudoku.calis_ust3.setText(Sudoku.calis_ust3.getText()+"  -----------------------------------------------------");
        System.out.println(" -----------------------");
        
    }
    
    public void run() {

        System.out.println("Running " + threadName);
        Main sudoku = new Main();
        if (solve(8, 0, gelenmatris)) {
            Thread3.thread3_endTime = System.currentTimeMillis();
                        Thread3.thread3_estimatedTime = Thread3.thread3_endTime - Main.thread3_startTime; 
                        Thread3.thread3_seconds = (double)Thread3.thread3_estimatedTime/1000;
                        System.out.println("******************> "+Thread3.thread3_seconds);
                         SudokuFrame.enkisa_thread.setText(threadName+" : "+String.valueOf(new Double(Thread3.thread3_seconds))+" Sn");
            
             System.out.println(threadName+" *********** Thred sonlandı ***********");
             
             
                       
        
        
             
             writeMatrix(gelenmatris);
              if(Main.thread2.isAlive()){
                        Main.thread2.stop();
          
                       
                        
                        Thread2.writeMatrix(Thread2.gelenmatris);
                        System.out.println(" 2 durduruldu");
                    }
                    else{
                        System.out.println("2 "+Main.thread2.getState());
                    }
              
              if(Main.thread1.isAlive()){
                        Main.thread1.stop();
                      
                        
                        Thread1.writeMatrix(Thread1.gelenmatris);
                        System.out.println("1 durduruldu");
                    }
                    else{
                        System.out.println("1 "+Main.thread1.getState());
                    }
              if(Main.thread4.isAlive()){
                        Main.thread4.stop();
                        
                      
                        
                        Thread4.writeMatrix(Thread4.gelenmatris);
                        System.out.println("4 durduruldu");
                    }
                    else{
                        System.out.println("4 "+Main.thread4.getState());
                    }
              
              
              
              
              
            //System.out.println(threadName + "---");
        } else {
            System.out.println("NONE");
        }
           sudoku00.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][0])));
      sudoku01.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][1])));
      sudoku02.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][2])));
      sudoku03.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][3])));
      sudoku04.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][4])));
      sudoku05.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][5])));
      sudoku06.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][6])));
      sudoku07.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][7])));
      sudoku08.setText(String.valueOf(new Integer(Thread3.gelenmatris[0][8])));
      
      sudoku10.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][0])));
      sudoku11.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][1])));
      sudoku12.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][2])));
      sudoku13.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][3])));
      sudoku14.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][4])));
      sudoku15.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][5])));
      sudoku16.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][6])));
      sudoku17.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][7])));
      sudoku18.setText(String.valueOf(new Integer(Thread3.gelenmatris[1][8])));
      
      sudoku20.setText(String.valueOf(new Integer(Thread2.gelenmatris[2][0])));
      sudoku21.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][1])));
      sudoku22.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][2])));
      sudoku23.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][3])));
      sudoku24.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][4])));
      sudoku25.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][5])));
      sudoku26.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][6])));
      sudoku27.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][7])));
      sudoku28.setText(String.valueOf(new Integer(Thread3.gelenmatris[2][8])));
      
      sudoku30.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][0])));
      sudoku31.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][1])));
      sudoku32.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][2])));
      sudoku33.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][3])));
      sudoku34.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][4])));
      sudoku35.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][5])));
      sudoku36.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][6])));
      sudoku37.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][7])));
      sudoku38.setText(String.valueOf(new Integer(Thread3.gelenmatris[3][8])));
      
      sudoku40.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][0])));
      sudoku41.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][1])));
      sudoku42.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][2])));
      sudoku43.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][3])));
      sudoku44.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][4])));
      sudoku45.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][5])));
      sudoku46.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][6])));
      sudoku47.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][7])));
      sudoku48.setText(String.valueOf(new Integer(Thread3.gelenmatris[4][8])));
      
      sudoku50.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][0])));
      sudoku51.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][1])));
      sudoku52.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][2])));
      sudoku53.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][3])));
      sudoku54.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][4])));
      sudoku55.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][5])));
      sudoku56.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][6])));
      sudoku57.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][7])));
      sudoku58.setText(String.valueOf(new Integer(Thread3.gelenmatris[5][8])));
      
      sudoku60.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][0])));
      sudoku61.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][1])));
      sudoku62.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][2])));
      sudoku63.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][3])));
      sudoku64.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][4])));
      sudoku65.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][5])));
      sudoku66.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][6])));
      sudoku67.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][7])));
      sudoku68.setText(String.valueOf(new Integer(Thread3.gelenmatris[6][8])));
      
      sudoku70.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][0])));
      sudoku71.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][1])));
      sudoku72.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][2])));
      sudoku73.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][3])));
      sudoku74.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][4])));
      sudoku75.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][5])));
      sudoku76.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][6])));
      sudoku77.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][7])));
      sudoku78.setText(String.valueOf(new Integer(Thread3.gelenmatris[7][8])));
      
      
      sudoku80.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][0])));
      sudoku81.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][1])));
      sudoku82.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][2])));
      sudoku83.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][3])));
      sudoku84.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][4])));
      sudoku85.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][5])));
      sudoku86.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][6])));
      sudoku87.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][7])));
      sudoku88.setText(String.valueOf(new Integer(Thread3.gelenmatris[8][8])));

       // System.out.println("Çalışmakta olan Thread --> " + threadName + " ");

    }

    static boolean solve(int i, int j, int[][] cells) {
        if (j == 9) {
            j = 0;
            if (--i == -1) {
                return true;
            }
           
        }
        if (cells[i][j] != 0) 
        {
            return solve(i, j+1, cells);
        }

        for (int val = 1; val <= 9; ++val) {
            if (legal(i, j, val, cells)) {
                cells[i][j] = val;
                if (solve(i, j+1, cells)) {

                    return true;
                }

            }
        }

         //writeMatrix(cells);

     
        //System.out.println(threadName + " <--> " + cells[i][j]);

        cells[i][j] = 0; // reset on backtrack
        // writeMatrix(deneme2.matris);
        return false;
    }

    static boolean legal(int i, int j, int val, int[][] cells) {
        for (int k = 0; k < 9; ++k) //satırda işlemleri yaptı
        {
            if (val == cells[k][j]) {
                return false;
            }
        }

        for (int k = 0; k < 9; ++k) 
        {
            if (val == cells[i][k]) {
                return false;
            }
        }

        int boxRowOffset = (i / 3) * 3;
        int boxColOffset = (j / 3) * 3;
        for (int k = 0; k < 3; ++k) 
        {
            for (int m = 0; m < 3; ++m) {
                if (val == cells[boxRowOffset + k][boxColOffset + m]) {
                    return false;
                }
            }
        }
        Date dt=new Date();
       // DosyayaEkle(dt.toString()+"----"+"("+i+","+j+") ye "+val+" eklendi");
        // Sudoku.calis_alt3.setText(Sudoku.calis_alt3.getText()+dt.toString()+"----"+"("+i+","+j+") ye "+val+" eklendi \n");
        return true; // no violations, so it's legal
    }
    private static void DosyayaEkle(String yazi){
            try{
                  File dosya = new File("C:\\Gecici\\Thread-3.txt");
                  FileWriter yazici = new FileWriter(dosya,true);
                  BufferedWriter yaz = new BufferedWriter(yazici);
                  yaz.newLine();
                  yaz.write(yazi);
                  yaz.close();
               //   System.out.println("Ekleme İşlemi Başarılı");
            }
            catch (Exception hata){
                  hata.printStackTrace();
            }
      }
}

