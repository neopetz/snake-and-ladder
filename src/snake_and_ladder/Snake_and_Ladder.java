
package snake_and_ladder;

import java.util.Random;
import java.util.Scanner;


public class Snake_and_Ladder {
    
public static final String RED ="\033[1;31m";
public static final String GREEN ="\033[0;32m";
public static final String MAGENTA ="\033[0;35m";
public static final String BLACKBOLD ="\033[1;30m";
public static final String BLUE ="\033[1;34m";
public static final String YELLOW ="\033[0;33m";
public static final String RESET ="\033[0;30m";
public static final String YELLOWBACK ="\033[43m";


    public static void main(String[] args) {
        
         
        
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        
        int arr_board[][]=new int[100][100]; 
        String arr_display_board[][]=new String[100][100]; 
        
        arr_board[0][1]=0;  arr_board[1][1]=0; 
        arr_board[0][2]=17; arr_board[1][2]=5;
        arr_board[0][3]=20; arr_board[1][3]=0;
        arr_board[0][4]=5;  arr_board[1][4]=0;
        arr_board[0][5]=0;  arr_board[1][5]=0;
        arr_board[0][6]=22; arr_board[1][6]=5;
        arr_board[0][7]=5;  arr_board[1][7]=22;
        arr_board[0][8]=7;  arr_board[1][8]=0;
        arr_board[0][9]=0;  arr_board[1][9]=0;
        arr_board[0][10]=0; arr_board[1][10]=0;
        
        arr_board[2][1]=0;  arr_board[3][1]=0;
        arr_board[2][2]=0;  arr_board[3][2]=5;
        arr_board[2][3]=24; arr_board[3][3]=28;
        arr_board[2][4]=5;  arr_board[3][4]=9;
        arr_board[2][5]=7;  arr_board[3][5]=26;
        arr_board[2][6]=0;  arr_board[3][6]=5;
        arr_board[2][7]=0;  arr_board[3][7]=24;
        arr_board[2][8]=5;  arr_board[3][8]=12;
        arr_board[2][9]=0;  arr_board[3][9]=0;
        arr_board[2][10]=0; arr_board[3][10]=0;
        
        arr_board[4][1]=0;  arr_board[5][1]=5;
        arr_board[4][2]=0;  arr_board[5][2]=0;
        arr_board[4][3]=5;  arr_board[5][3]=9;
        arr_board[4][4]=20; arr_board[5][4]=12;
        arr_board[4][5]=23; arr_board[5][5]=26;
        arr_board[4][6]=5;  arr_board[5][6]=0;
        arr_board[4][7]=13; arr_board[5][7]=0;
        arr_board[4][8]=0;  arr_board[5][8]=5;
        arr_board[4][9]=5;  arr_board[5][9]=0;
        arr_board[4][10]=0; arr_board[5][10]=0;
        
        arr_board[6][1]=0;  arr_board[7][1]=0;
        arr_board[6][2]=0;  arr_board[7][2]=23;
        arr_board[6][3]=5;  arr_board[7][3]=0;
        arr_board[6][4]=0;  arr_board[7][4]=5;
        arr_board[6][5]=13; arr_board[7][5]=10;
        arr_board[6][6]=28; arr_board[7][6]=0;
        arr_board[6][7]=5;  arr_board[7][7]=0;
        arr_board[6][8]=0;  arr_board[7][8]=0;
        arr_board[6][9]=0;  arr_board[7][9]=5;
        arr_board[6][10]=0; arr_board[7][10]=0;
        
        arr_board[8][1]=0;  arr_board[9][1]=0;
        arr_board[8][2]=5;  arr_board[9][2]=0;
        arr_board[8][3]=0;  arr_board[9][3]=3;
        arr_board[8][4]=0;  arr_board[9][4]=5;
        arr_board[8][5]=0;  arr_board[9][5]=0;
        arr_board[8][6]=5;  arr_board[9][6]=0;
        arr_board[8][7]=3;  arr_board[9][7]=10;
        arr_board[8][8]=5;  arr_board[9][8]=0;
        arr_board[8][9]=0;  arr_board[9][9]=17;
        arr_board[8][10]=0; arr_board[9][10]=0;
        

        
        int x=0,y=0,player1_current_power=0,player2_current_power=0;
        int player1_attack=0,player2_attack=0,player1_dice=0,player2_dice=0;
        int player1_current_position=0,player2_current_position=0;
        int test_y=0,test_x=0,p2_test_y=0,p2_test_x=0;
        int test_y_snake =0,test_x_snake =0,p2_test_y_snake =0,p2_test_x_snake =0;
        int  y_snake=0,x_snake=0,y_position_remain=0,x_position_remain=0,power=0;
        int p2_y_snake=0,p2_x_snake=0,p2_y_position_remain=0,p2_x_position_remain=0,p2_power=0;
        int compare_step =0,p2_compare_step=0;
        int p1_flag=0,p2_flag=0,y_board=0,x_board=0,a=0,b=0,c=0,d=0,sw1=0,sw2=0,sw1_snake=0,sw2_snake=0;
        String player1_info="P1",player2_info="P2",temp="",all="ALL",input="";;

       for(int count=0;count<1000;count++){ 
             
        System.out.println("");
        System.out.println(RED+"\t\t\t\t\t     SNAKE"+RESET+" AND "+BLUE+"LADDER"+RESET);        
        System.out.println("\n");
        System.out.println("\t\t\t"+RED+" ════════════════════════════════════════════════"+RESET);    
        //arr_display_board[test_x][test_y]=GREEN+player1_info+RESET;
        //System.out.print(" "+test_x+test_y);
       //arr_display_board[x_board][y_board]=temp;
   
     
     
       display(a,b,c,d);
     
        
        
         System.out.println(MAGENTA+"═════════════════════════════════════════════════════════════════════════════════════"+RESET);
         System.out.println("");
         System.out.println("ATTACK MODES"+"\t\t\t\t\t"+"5 = 1 Power Up");
         System.out.println("1."+BLUE+" Roll the Dice"+"\t\t\t\t"+"Even Numbers : Ladders"+RESET);
         System.out.println("2."+RED+" Use Power"+"\t\t\t\t\t"+"Odd Numbers  : Snake"+RESET);
         System.out.println("");
         System.out.println(RED+"POWER"+RESET+" = Player Move Backward by 5 * (Player power)\n\n");
         System.out.println(MAGENTA+"═════════════════════════════════════════════════════════════════════════════════════"+RESET);
         System.out.println("");
  
/********************************PLAYER 1******************************************************************************/
   while(p1_flag==0){     
         System.out.println(""); 
  
         
         
          do{
     
   System.out.print(RED+"Player 1 : "+RESET);  
     while(!in.hasNextInt()){
        input = in.next();   
         System.out.println("INVALID INPUT "); 
         System.out.print(RED+"Player 1 : "+RESET);
     }
    player1_attack = in.nextInt(); 
 }while(player1_attack<0);
          
         
         
         
         
         
         
         
         System.out.println("Current Power : "+player1_current_power);
         
         switch(player1_attack){
             case 1:
                player1_dice = 1+random.nextInt(6);
             // player1_dice=35;
                 System.out.println("Player 1 Used Dice : "+player1_dice);
                 player1_current_position=player1_current_position+player1_dice;
                 System.out.println("Current Position : "+player1_current_position);
                 
                 
                 
                 
                 test_y = player1_current_position%10;
                 test_x = player1_current_position/10;
               //  temp = arr_display_board[test_x][test_y];
                 
                    if(test_y==0){
                         test_y=10;
                         test_x=test_x-1;
                    }
                 
                     System.out.println("for inner y "+test_y);
                     System.out.println("for inner x "+test_x);
                     
                      b = test_y;
                      a = test_x;
                    
                    System.out.print(" temp "+temp);
                     
                    
                     
                     System.out.print("location "+arr_display_board[test_x][test_y]+" "+x_board+""+y_board);
                     
                     
                     
                     System.out.println("before  "+temp+x_board+y_board);
                                      y_snake = test_y;
                                      x_snake =test_x;
                                    //  y_board=test_y;
                                      //x_board=test_x;
                                     
                        // arr_display_board[x_board][y_board]=temp;   
                          //arr_display_board[test_x][test_y]=GREEN+player1_info+RESET;
                 if(arr_board[test_x][test_y]==5){    
                   player1_current_power=player1_current_power+1;  
                 } else if(arr_board[test_x][test_y]%2==0&&arr_board[test_x][test_y]!=0){
                            System.out.println(BLUE+"You are in a Ladder"+RESET);
                     
                             compare_step = arr_board[test_x][test_y];
                        
                            // int temp1_position = player1_current_position;
                            
                             System.out.println("array : "+compare_step);
                     for(x=test_x;x<10;x++){
                         for(y=1;y<=10;y++){  
                             if(compare_step==arr_board[x][y]){
                                 
                                 if(sw1==1){
                                                                      
                                  System.out.println("true position"+player1_current_position);
                                   if(test_y==10){
                                       test_y=10;
                                      test_x=x*10;                                     
                                  }else{ 
                                    //   int a=y;
                                    //   int b=x;
                                      test_y = y;
                                      test_x = x*10;
                                     System.out.println("for x"+x);
                                     System.out.println("for y"+y);
                                       b = y;
                                       a = x;
                                   }
                                  // sw1=0;
                                   
                                   player1_current_position=test_y+test_x;
                                 }else{
                                     
                                     sw1=1;
                                 }

 
                                    
                             }
                              
                         }
                     }
                     
                                    // arr_display_board[x][y]=GREEN+player1_info+RESET;
                                    //System.out.print(" "+x_board+y_board);
                                     
                                   
                            System.out.println("Current Position : "+player1_current_position);
                     
                 }else if(arr_board[test_x][test_y]%2!=0&&arr_board[test_x][test_y]!=0){
                                 System.out.println(RED+"You are got a Snake"+RESET);                    
                                 compare_step = arr_board[test_x][test_y];                     
                       // int temp1_position = player1_current_position;
                                 System.out.println("array : "+compare_step);                       
                                  test_y=test_y-1;
                        
                     for(x=test_x;x>=0;x--){
                         for(y=test_y;y>0;y--){   
                             if(compare_step==arr_board[x][y]){
                               
                               System.out.println("for jay x "+x);
                               System.out.println("for jay y"+y);
                               
                                   if(y==10){
                                       test_y=10;
                                       test_x=x*10;
                                  }else{                                     
                                       test_y_snake = y;
                                       test_x_snake = x*10;
                                       System.out.println("test snake x "+test_x_snake);
                                       System.out.println("test snake y"+test_y_snake);
                                      b = y;
                                      a = x;
                                   }  
                                   
                                   
                             }   
                         }
                         test_y=10;
                     }                    
                             player1_current_position=test_x_snake+test_y_snake;

                      if(player1_current_position==0){
                          
                            y_position_remain= y_snake;
                            x_position_remain=x_snake*10;         
                            player1_current_position=y_position_remain+x_position_remain;
                            System.out.println("Current Position : "+player1_current_position);
                      }else{
                            System.out.println("Current Position : allll "+player1_current_position);
                      }  
                 } 
                     p1_flag=1;
                 break;
                 
             case 2: 
                 if(player1_current_power==0){
                     System.out.println("No Enough Power");
                 }else{
                     p1_flag=1;
                     System.out.println("Player 1 Used Power: ");
                     System.out.println("Current Position : "+player1_current_position);
                     power = 5*player1_current_power;
                     player2_current_position = player2_current_position - power;
                     player1_current_power=0;
                 }            
                 break;
                 default:System.out.println("Invalid Input");
          }   
  }    
     /****************************PLAYER 2*************************************************************************/    
        
  while(p2_flag==0){      
        
         System.out.println(""); 
         
         
          do{
     
   System.out.print(RED+"Player 2 : "+RESET);  
     while(!in.hasNextInt()){
        input = in.next();   
         System.out.println("INVALID INPUT "); 
         System.out.print(RED+"Player 2 : "+RESET);
     }
    player2_attack = in.nextInt(); 
 }while(player2_attack<0);
         
         
         
         System.out.println("Current Power : "+player2_current_power);
         
         
         switch(player2_attack){
             
             case 1:
                 player2_dice = 1+random.nextInt(6);
             // player2_dice=72;
                 System.out.println("Player 2 Used Dice : "+player2_dice);
                 player2_current_position=player2_current_position+player2_dice;
                 System.out.println("Current Position : "+player2_current_position);
                 
                 p2_test_y = player2_current_position%10;
                 p2_test_x = player2_current_position/10;
                 if(p2_test_y==0){
                     p2_test_y=10;
                     p2_test_x=p2_test_x-1;
                 }
                 
                     System.out.println("for inner y "+p2_test_y);
                     System.out.println("for inner x "+p2_test_x);
                     
                     d=p2_test_y;
                     c=p2_test_x;
                                      p2_y_snake = p2_test_y;
                                      p2_x_snake =p2_test_x;
                 if(arr_board[p2_test_x][p2_test_y]==5){   
                        player2_current_power=player2_current_power+1;
                        
                 } else if(arr_board[p2_test_x][p2_test_y]%2==0&&arr_board[p2_test_x][p2_test_y]!=0){
                        System.out.println("You are in a Ladder");
                        p2_compare_step = arr_board[p2_test_x][p2_test_y];        
                       // int temp1_position = player1_current_position;
                        System.out.println("array : "+compare_step);//
                     for(x=p2_test_x;x<10;x++){
                         for(y=1;y<=10;y++){
                             if(p2_compare_step==arr_board[x][y]){
                                 
                                 if(sw2==1){
                                   if(p2_test_y==10){
                                       p2_test_y=10;
                                       p2_test_x=x*10;
                                   }else{ 
                                      p2_test_y = y;
                                      p2_test_x = x*10;
                            //   System.out.println("for x"+x);
                             //  System.out.println("for y"+y);
                                       d = y;
                                       c = x;
                                    }
                                    sw2=0;
                                      player2_current_position=p2_test_x+p2_test_y;  
                                 }else{
                                     sw2=1;
                                 }

                             }     
                         }
                     }
                                      System.out.println("Current Position : "+player2_current_position);  
                                      
                 }else if(arr_board[p2_test_x][p2_test_y]%2!=0&&arr_board[p2_test_x][p2_test_y]!=0){
                           System.out.println(RED+"You are got a Snake"+RESET);
                           p2_compare_step = arr_board[p2_test_x][p2_test_y];
                       // int temp1_position = player1_current_position;
                           System.out.println("array : "+p2_compare_step);// 
                           p2_test_y=p2_test_y-1;
                           
                     for(x=p2_test_x;x>=0;x--){
                         int ine=10;
                         for(y=p2_test_y;y>0;y--){
                             if(p2_compare_step==arr_board[x][y]||p2_compare_step==arr_board[x][ine]){ 
                                 
                                // if(sw2_snake==1){
                                  System.out.println("for jay x "+x);
                                  System.out.println("for jay y"+y);
                                   if(y==10){
                                      p2_test_y=10;
                                      p2_test_x=x*10;
                                  }else{    
                                      p2_test_y_snake = y;
                                      p2_test_x_snake = x*10;
                                      System.out.println("test snake x "+p2_test_x_snake);
                                      System.out.println("test snake y"+p2_test_y_snake);
                                      c=x;
                                      d=y;
                                    }
                                   //sw2_snake=0;
                                // }else{
                                 //    sw2_snake=1;
                               //  }

                             }    
                         }
                                     p2_test_y=10;
                     } 
                                     player2_current_position=p2_test_x_snake+p2_test_y_snake;
                      if(player2_current_position==0){               
                                     p2_y_position_remain= p2_y_snake;
                                     p2_x_position_remain=p2_x_snake*10;                                     
                                     player2_current_position=p2_y_position_remain+p2_x_position_remain;
                                     System.out.println("Current Position : "+player2_current_position);
                      }else{
                                     System.out.println("Current Position : allll "+player2_current_position);
                      }  
                 }  
                                     p2_flag=1;
                 break;
                 
             case 2:
                 
                 if(player2_current_power==0){
                     System.out.println("No Enough Power");
                 }else{
                     p2_flag=1;
                     System.out.println("Player 2 Used Power: ");
                     System.out.println("Current Position : "+player2_current_position);
                     p2_power = 5*player2_current_power;
                     player1_current_position = player1_current_position - p2_power; 
                     player2_current_power=0;
                 }
                 break;
                 default:System.out.println("Invalid Input");
           }        
         }
           if(player1_current_position>=100||player2_current_position>=100){
               if(player1_current_position>=100){
                   System.out.println("\n\n");
                   System.out.println(RED+"PLAYER 1 WINS"+RESET);
                   count=1000;
               }else if(player2_current_position>=100){
                   System.out.println("\n\n");
                   System.out.println(RED+"PLAYER 2 WINS"+RESET); 
                   count=1000;
               }else{
                   System.out.println("NOthing");
               }
           }       
          p2_flag=0;
          p1_flag=0;
       }        
      }
    
    
    public static int display(int A,int B,int C,int D){
        
      String arr_display_board[][]=new String[100][100];    
        
        arr_display_board[0][1]=" 0";  arr_display_board[1][1]=" 0"; 
        arr_display_board[0][2]="17";  arr_display_board[1][2]=" 5";
        arr_display_board[0][3]="20";  arr_display_board[1][3]=" 0";
        arr_display_board[0][4]=" 5";  arr_display_board[1][4]=" 0";
        arr_display_board[0][5]=" 0";  arr_display_board[1][5]=" 0";
        arr_display_board[0][6]="22";  arr_display_board[1][6]=" 5";
        arr_display_board[0][7]=" 5";  arr_display_board[1][7]="22";
        arr_display_board[0][8]=" 7";  arr_display_board[1][8]=" 0";
        arr_display_board[0][9]=" 0";  arr_display_board[1][9]=" 0";
        arr_display_board[0][10]=" 0"; arr_display_board[1][10]=" 0";
        
        arr_display_board[2][1]=" 0";  arr_display_board[3][1]=" 0";
        arr_display_board[2][2]=" 0";  arr_display_board[3][2]=" 5";
        arr_display_board[2][3]="24";  arr_display_board[3][3]="28";
        arr_display_board[2][4]=" 5";  arr_display_board[3][4]=" 9";
        arr_display_board[2][5]=" 7";  arr_display_board[3][5]="26";
        arr_display_board[2][6]=" 0";  arr_display_board[3][6]=" 5";
        arr_display_board[2][7]=" 0";  arr_display_board[3][7]="24";
        arr_display_board[2][8]=" 5";  arr_display_board[3][8]="12";
        arr_display_board[2][9]=" 0";  arr_display_board[3][9]=" 0";
        arr_display_board[2][10]=" 0"; arr_display_board[3][10]=" 0";
        
        arr_display_board[4][1]=" 0";  arr_display_board[5][1]=" 5";
        arr_display_board[4][2]=" 0";  arr_display_board[5][2]=" 0";
        arr_display_board[4][3]=" 5";  arr_display_board[5][3]=" 9";
        arr_display_board[4][4]="20";  arr_display_board[5][4]="12";
        arr_display_board[4][5]="23";  arr_display_board[5][5]="26";
        arr_display_board[4][6]=" 5";  arr_display_board[5][6]=" 0";
        arr_display_board[4][7]="13";  arr_display_board[5][7]=" 0";
        arr_display_board[4][8]=" 0";  arr_display_board[5][8]=" 5";
        arr_display_board[4][9]=" 5";  arr_display_board[5][9]=" 0";
        arr_display_board[4][10]=" 0"; arr_display_board[5][10]=" 0";
        
        arr_display_board[6][1]=" 0";  arr_display_board[7][1]=" 0";
        arr_display_board[6][2]=" 0";  arr_display_board[7][2]="23";
        arr_display_board[6][3]=" 5";  arr_display_board[7][3]=" 0";
        arr_display_board[6][4]=" 0";  arr_display_board[7][4]=" 5";
        arr_display_board[6][5]="13";  arr_display_board[7][5]="10";
        arr_display_board[6][6]="28";  arr_display_board[7][6]=" 0";
        arr_display_board[6][7]=" 5";  arr_display_board[7][7]=" 0";
        arr_display_board[6][8]=" 0";  arr_display_board[7][8]=" 0";
        arr_display_board[6][9]=" 0";  arr_display_board[7][9]=" 5";
        arr_display_board[6][10]=" 0"; arr_display_board[7][10]=" 0";
        
        arr_display_board[8][1]=" 0";  arr_display_board[9][1]=" 0";
        arr_display_board[8][2]=" 5";  arr_display_board[9][2]=" 0";
        arr_display_board[8][3]=" 0";  arr_display_board[9][3]=" 3";
        arr_display_board[8][4]=" 0";  arr_display_board[9][4]=" 5";
        arr_display_board[8][5]=" 0";  arr_display_board[9][5]=" 0";
        arr_display_board[8][6]=" 5";  arr_display_board[9][6]=" 0";
        arr_display_board[8][7]=" 3";  arr_display_board[9][7]="10";
        arr_display_board[8][8]=" 5";  arr_display_board[9][8]=" 0";
        arr_display_board[8][9]=" 0";  arr_display_board[9][9]="17";
        arr_display_board[8][10]=" 0"; arr_display_board[9][10]=" 0";
        
        
      String player1_info="P1",player2_info="P2",temp="",all="ALL";
      
        
           for(int x=0;x<10;x++){
                System.out.print("\t\t\t");
            for(int y=1;y<=10;y++){ 
                
                if((B==y&&A==x)&&(D==y&&C==x)){
                    System.out.print(RED+" │"+RESET+arr_display_board[x][y]+GREEN+all+RESET); 
                }else if(B==y&&A==x){
                     System.out.print(RED+" │"+RESET+arr_display_board[x][y]+MAGENTA+player1_info+RESET+" "); 
                }else if(D==y&&C==x){
                    System.out.print(RED+" │"+RESET+arr_display_board[x][y]+BLUE+player2_info+RESET+" "); 
                }else{
                
                System.out.print(RED+" │  "+RESET+arr_display_board[x][y]+" ");  
                }
            }
                
                
                System.out.println(RED+"│"+RESET);
                System.out.println("\t\t\t"+RED+" ════════════════════════════════════════════════"+RESET);             
        }
        
        return 0;
    }
    
    
    
    }
    
  
        
       
  

