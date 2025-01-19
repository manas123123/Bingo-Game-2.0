import java.util.Scanner;
import java.io.*;
public class Bingo2
{
    public static void main(String[] args)throws InterruptedException , IOException
    {
        Scanner sc=new Scanner(System.in);
        Bingo2 ob=new Bingo2();
        ob.loading();
        System.out.println("");
        System.out.println(" WW        WWWW        WW  EEEEEEEE   LL           CCCC      OOOO     MMM     MMM  EEEEEEEE ");
        System.out.println("  WW      WW  WW      WW    EE         LL         CC        OO    OO   MM MM MM MM  EE       ");
        System.out.println("   WW    WW    WW    WW    EEEEEEEE   LL        CC        OO      OO  MM  MMM  MM  EEEEEEEE ");
        System.out.println("    WW  WW      WW  WW      EE         LL         CC        OO    OO   MM       MM  EE       ");
        System.out.println("     WWWW        WWWW      EEEEEEEE   LLLLLLLL     CCCC      OOOO     MM       MM  EEEEEEEE "); 
        System.out.println();
        System.out.println("                             TTTTTTTTTTTT     OOOO    ");
        System.out.println("                                  TT        OO    OO  ");
        System.out.println("                                  TT       OO      OO ");
        System.out.println("                                  TT        OO    OO  ");
        System.out.println("                                  TT          OOOO    ");
        System.out.println("");
        System.out.println("                BBBBB    IIIIIIII  NNN     NN      GGGG        OOOO                     ");
        System.out.println("                BB   BB     II     NN NN   NN   GGG          OO    OO                ");
        System.out.println("                BBBBB       II     NN  NN  NN  GGG   GGGGG  OO      OO                   ");
        System.out.println("                BB   BB     II     NN   NN NN   GGG   GGG    OO    OO                          ");
        System.out.println("                BBBBB    IIIIIIII  NN     NNN      GGGG        OOOO        ");
        System.out.println("");
        System.out.println(""); 
        System.out.println(""); 
        System.out.println("To Continue Press Enter  "); 
        String pt=sc.nextLine();
        ob.rules();
    }

    public void rules()throws InterruptedException , IOException
    {
        Bingo2 ob=new Bingo2();
        Scanner sc=new Scanner(System.in);
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        System.out.print("\f");
        System.out.println("Do You Wanna Know How To Play This Game Or Not\n");
        System.out.println("1.Enter 'yes' If You Wanna Know."); 
        System.out.println("2.Enter 'no' If You Don't."); 
        String choice;
        choice=sc.next().toLowerCase().trim();
        if(choice.equals("no"))
            ob.game();
        else if(choice.equals("yes"))
        {
            System.out.print("\f");
            String na=" ➊ This Is a two player game where one of them is you and the other is the computer. ➋ You both will be given a set of 25 random numbers arranged in a 5x5 grid. ➌ Each player Plays one number. ➍ the goal is to have 5 sets of 5 numbers which are either in. vertical or horizontal or diagonal manner example-.    1  2  3  4  5.    6  7  8  9 10.   11 12 13 14 15.   16 17 18 19 20.   21 22 23 24 25.in this set of 5x5 numbers can be in the manner below.   VERTICAL.      ↓                   ↓.      1  2  3  4  5       ██  2  3  4  5.      6  7  8  9 10       ██  7  8  9 10.     11 12 13 14 15   ⏩   ██ 12 13 14 15.     16 17 18 19 20       ██ 17 18 19 20.     21 22 23 24 25       ██ 22 23 24 25.      Or HORIZONTAL.   →  1  2  3  4  5    → ██ ██ ██ ██ ██.      6  7  8  9 10        6  7  8  9 10.     11 12 13 14 15   ⏩   11 12 13 14 15.     16 17 18 19 20       16 17 18 19 20.     21 22 23 24 25       21 22 23 24 25.  Or Diagonal.   ↘                   ↘.     1  2  3  4  5       ██  2  3  4  5.     6  7  8  9 10        6 ██  8  9 10.    11 12 13 14 15   ⏩   11 12 ██ 14 15.    16 17 18 19 20       16 17 18 ██ 20.    21 22 23 24 25       21 22 23 24 ██. ➎ If after someone's move both complete their card,.the match goes to the one who's move it was.";
            na=ob.titlecase(na); 
            for(int i=0;i<na.length()-1;i++)
            {
                if(na.charAt(i)=='.')
                {
                    System.out.println();
                    i++;
                }
                else if(na.charAt(i)=='➋'||na.charAt(i)=='➌'||na.charAt(i)=='➍'||na.charAt(i)=='➎')
                    System.out.println("");
                System.out.print(na.charAt(i));
                Thread.sleep(50);
            }
            System.out.println("\n\n");
            System.out.println("To Continue Press Enter  "); 
            String a=in.readLine();
            ob.game();
        }
        else
        {
            System.err.println("That Was A Wrong Choice. \n Please Enter Either 'yes' or 'no' ");
            Thread.sleep(5000);
            ob.rules();
        }
    }

    public String titlecase(String na)
    {
        String wd="";
        char ch=' ';
        for(int i=1;i<na.length();i++)
        {
            ch=na.charAt(i);
            if(na.charAt(i-1)==' ')
                ch=Character.toUpperCase(ch);
            wd=wd+ch;
        }
        return(wd);
    }

    public void game()throws InterruptedException , IOException 
    {   
        Bingo2 ob=new Bingo2();
        Scanner sc=new Scanner(System.in);
        System.out.print("\f");
        int p[][]=new int[5][5];
        int com[][]=new int[5][5];
        int p2[][]=new int[5][5];
        int com2[][]=new int[5][5];
        int p1[]=new int[25];
        int com1[]=new int[25];
        int a=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++,a++)
            {
                p1[a]=a+1;
                com1[a]=a+1;
            }
        }
        int temp=0;
        int tem=0;
        for(int i=0;i<25;i++)
        {
            int random1=(int)(Math.random()*25);
            int random2=(int)(Math.random()*25);
            int random3=(int)(Math.random()*25);
            int random4=(int)(Math.random()*25);
            tem=p1[random1];
            p1[random1]=p1[random3];
            p1[random3]=p1[random4];
            p1[random4]=p1[random2];
            p1[random2]=tem;
        }
        for(int i=0;i<25;i++)
        {
            int random1=(int)(Math.random()*25);
            int random2=(int)(Math.random()*25);
            int random3=(int)(Math.random()*25);
            int random4=(int)(Math.random()*25);
            temp=com1[random1];
            com1[random1]=com1[random3];
            com1[random3]=com1[random4];
            com1[random4]=com1[random2];
            com1[random2]=temp;
        }
        a=0;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++,a++)
            {
                p[i][j]=p1[a];
                p2[i][j]=p1[a];
                com[i][j]=com1[a];
                com2[i][j]=com1[a];
            }
        }
        boolean flag=false;
        while(flag==false)
        {
            System.out.println("Which Difficulty Level Do You Wanna Play In?");
            System.out.println("1 For Easy ");
            System.out.println("2 For Hard");
            System.out.println("3 For Insane");
            String pt=sc.nextLine();
            if(pt.equals("1"))
            {
                ob.input(com,com2,p,p2,pt);
                flag=true;
            }
            else if(pt.equals("2"))
            {
                ob.input(com,com2,p,p2,pt);
                flag=true;
            }
            else if(pt.equals("3"))
            {
                ob.input(com,com2,p,p2,pt);
                flag=true;
            }
            else
                System.out.println("Please Enter Properly");
        }
    }

    public int num(String na)
    {
        for(int i=0;i<na.length();i++)
        {
            if(Character.isDigit(na.charAt(i))==false)
                return(2);
        }
        return(0);
    }

    public void input(int com[][],int com2[][],int pl[][],int pl2[][],String ch)throws InterruptedException , IOException
    {
        Scanner sc=new Scanner(System.in);
        Bingo2 ob=new Bingo2();
        ob.print(pl);
        System.out.println("This Is Your Bingo Card!!\n");
        System.out.println("To Continue Press Enter");
        String enter=sc.nextLine();
        ob.loading();
        int bi[]={0};
        int bi2[]={0};
        int num=0;
        String nu="";
        int flag=0;
        int over=1;
        int move=0;
        int temp=0;
        ob.print(pl,bi[0],temp,pl2);
        while(over==1)
        {
            System.out.println();
            bi[0]=0;
            bi2[0]=0;
            flag=0;
            while(flag==0)
            {
                System.out.println("\nEnter The Number From Your Bingo Card.");
                nu=sc.nextLine();
                flag=0;
                flag=ob.num(nu);
                if(flag==2)
                {
                    System.out.println("Enter only in numbers");
                    flag=0;
                }
                else
                {
                    num=Integer.parseInt(nu);
                    for(int a=0;a<5;a++)
                    {
                        for(int b=0;b<5;b++)
                        {
                            if(pl[a][b]==num&&num>0)
                                flag=1;
                        }
                    }
                    if(flag==0)
                        System.out.println("The Number You Have Entered Does Not Exist In Your Bingo Card \n Or Has Been Already Taken.");
                }
            }
            for(int a=0;a<5;a++)
            {
                for(int b=0;b<5;b++)
                {
                    if(pl[a][b]==num)
                        pl[a][b]=0;
                    if(com[a][b]==num)
                        com[a][b]=0;
                }
            }
            int plbi[][]=new int[12][5];
            int combi[][]=new int[12][5];
            int bipl[]=new int[12];
            int bicom[]=new int[12];
            temp=0;
            bi[0]=ob.check(1,1,pl,com,plbi,combi,bipl,bicom,bi[0],bi2[0]);
            bi2[0]=ob.check(1,2,pl,com,plbi,combi,bipl,bicom,bi[0],bi2[0]);
            ob.play(1,bi[0],bi2[0],com,pl,com2,pl2);
            ob.print(pl,bi[0],temp,pl2);
            int z[]={0};
            if(ch.equals("1"))
                temp=ob.easy(com);
            if(ch.equals("2"))
                temp=ob.hard(plbi,combi,bipl,bicom,move,pl,com);
            if(ch.equals("3"))
                temp=ob.insane(plbi,combi,bipl,bicom,move,pl,com,z);
            for(int a=0;a<5;a++)
            {
                for(int b=0;b<5;b++)
                {
                    if(com[a][b]==temp)
                        com[a][b]=0;
                    if(pl[a][b]==temp)
                        pl[a][b]=0;
                }
            }
            bi[0]=ob.check(2,1,pl,com,plbi,combi,bipl,bicom,bi[0],bi2[0]);
            bi2[0]=ob.check(2,2,pl,com,plbi,combi,bipl,bicom,bi[0],bi2[0]);
            ob.play(2,bi[0],bi2[0],com,pl,com2,pl2);
            ob.print(pl,bi[0],temp,pl2);
            move++;
        }
    }

    public int easy(int com[][])
    {
        int temp=0;
        int flag=0;
        while(flag==0)
        {
            temp=com[(int)(Math.random()*5)][(int)(Math.random()*5)];
            if(temp!=0)
                flag=1;
        }
        return(temp);
    }

    public int check(int a,int b,int pl[][],int com[][],int plbi[][],int combi[][],int bipl[],int bicom[],int bi,int bi2)throws InterruptedException , IOException
    {
        Bingo2 ob=new Bingo2();
        Scanner sc=new Scanner(System.in);
        bi=0;
        bi2=0;
        for(int i=0;i<5;i++)
        { 
            for(int j=0;j<5;j++)
            {
                plbi[i][j]=pl[i][j];
                plbi[i+5][j]=pl[j][i];
                combi[i][j]=com[i][j];
                combi[i+5][j]=com[j][i];
            }
        }
        for(int i=0;i<12;i++)
        {
            bipl[i]=0;
            bicom[i]=0;
        }
        for(int i=0,j=4;i<5;i++,j--)
        {
            plbi[10][i]=pl[i][i];
            plbi[11][i]=pl[i][j];
            combi[10][i]=com[i][i];
            combi[11][i]=com[i][j];
        }
        for(int i=0;i<12;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(plbi[i][j]==0)
                    bipl[i]++;
                if(combi[i][j]==0)
                    bicom[i]++;
            }
        }
        for(int i=0;i<12;i++)
        {
            if(bipl[i]==5)
                bi++;
            if(bicom[i]==5)
                bi2++;
        }
        if(b==1)
            return(bi);
        else
            return(bi2);
    }

    public void play(int a,int bi,int bi2,int com[][],int pl[][],int com2[][],int pl2[][])throws InterruptedException , IOException
    {
        Bingo2 ob=new Bingo2();
        Scanner sc=new Scanner(System.in);
        if(a==1)
        {
            if(bi>=5)
            {
                ob.rockets();
                System.out.println("\nTo Continue Press Enter  "); 
                String pt=sc.nextLine();
                System.out.print("\f");
                ob.endgame(com,pl,com2,pl2);
            }
            if(bi2>=5)
            {
                ob.loser();
                System.out.println("\nTo Continue Press Enter  "); 
                String pt=sc.nextLine();
                System.out.print("\f");
                ob.endgame(com,pl,com2,pl2);
            }
        }
        if(a==2)
        {
            if(bi2>=5)
            {
                ob.loser();
                System.out.println("\nTo Continue Press Enter  "); 
                String pt=sc.nextLine();
                System.out.print("\f");
                ob.endgame(com,pl,com2,pl2);
            }
            if(bi>=5)
            {
                ob.rockets();
                System.out.println("\nTo Continue Press Enter  "); 
                String pt=sc.nextLine();
                System.out.print("\f");
                ob.endgame(com,pl,com2,pl2);
            }
        }
    }

    public void loser()throws InterruptedException , IOException
    {
        for(int i=0;i<150;i++)
        {
            System.out.println();
            if(i==80)
                System.out.print("                                                                       SORRY");
            if(i==120)
                System.out.print("                                                                   YOU HAVE LOST");
            Thread.sleep(100);
        }
    }

    public void rockets()throws InterruptedException , IOException
    {
        int random=(int)(Math.random()*8+1);
        String n[]=new String[77];
        for(int j=1;j<77;j++)
        {
            n[j]="/\\";
        }
        for(int i=0;i<177;i++)
        {
            System.out.println();
            if(i==80)
                System.out.print("                                                                 CONGRATULATIONS");
            if(i==120)
                System.out.print("                                                                   YOU HAVE WON");
            if(i==149)
            {
                for(int j=1;j<77;j++)
                {
                    System.out.print(n[j]);
                }
            }
            Thread.sleep(100);
        }
        for(int asa=0;asa<=random;asa++)
        {
            int he=(int)(Math.random()*10)+8;
            int wi=(int)(Math.random()*120)+15;
            int he2=he;
            int wi2=wi;
            int he3=he;
            int wi3=wi;
            int he4=he;
            int wi4=wi;
            int he5=he;
            int wi5=wi;
            int he6=he;
            int wi6=wi;
            int he7=he;
            int wi7=wi;
            int he8=he;
            int wi8=wi;
            int he9=he;
            int wi9=wi;
            int he10=27;
            String na[][]=new String[28][154];
            for(int j=0;j<28;j++)
            {
                for(int s=0;s<154;s++)
                {
                    na[j][s]=" ";
                }
            }
            for(int a=0;he10>=he;a++,he10--)
            {
                System.out.print("\f");
                for(int j=1;j<77;j++)
                {
                    System.out.print(n[j]);
                }
                System.out.println();
                for(int j=0;j<28;j++)
                {
                    for(int s=0;s<154;s++)
                    {
                        System.out.print(na[j][s]);
                    }
                    System.out.println();
                }
                if(a>0)
                    na[he10+1][wi]=" ";
                na[he10][wi]="|";
                Thread.sleep(50);
            }
            na[he][wi]="☓";
            for(int m=0;m<7;m++)
            {
                System.out.print("\f");
                for(int j=1;j<77;j++)
                {
                    System.out.print(n[j]);
                }
                System.out.println();
                for(int j=0;j<28;j++)
                {
                    for(int s=0;s<154;s++)
                    {
                        System.out.print(na[j][s]);
                    }
                    System.out.println();
                }
                he2--;
                wi2=wi2-2;                
                na[he2][wi2]="╲";
                he3--;
                wi3=wi3+2;
                na[he3][wi3]="╱";
                he4++;
                wi4=wi4-2;
                na[he4][wi4]="╱";
                he5++;
                wi5=wi5+2;
                na[he5][wi5]="╲";
                wi6=wi6-2;                
                na[he6][wi6]="-";
                wi7=wi7+2;
                na[he7][wi7]="-";
                he8--;                     
                na[he8][wi8]="|";
                he9++;                     
                na[he9][wi9]="|";
                Thread.sleep(25);
            }
        }
        System.out.println("\f");
    }

    public int hard(int plbi[][],int combi[][],int bipl[],int bicom[],int move,int pl[][],int com[][])throws InterruptedException , IOException
    {
        int max[]=new int[12];
        int temp=0;
        if(move==0&&com[2][2]!=0)
        {
            temp=com[2][2];
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(pl[i][j]==com[2][2])
                        pl[i][j]=0;
                }
            }
            com[2][2]=0;
        }
        else
        { 
            for(int i=0;i<12;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(combi[i][j]==0)
                        max[i]++;
                }
            }
            int temp2=0;            
            for(int i=0;i<12;i++)
            {
                if(max[i]<5)
                {
                    temp2=max[i];
                    i=12;
                }
            }
            int maxi=0;
            for(int i=1;i<12;i++)
            {
                if(max[i]>=temp2&&max[i]<5)
                {
                    maxi=i;
                    temp2=max[i];
                }
            }                
            for(int i=0;i<5;i++)
            {
                if(combi[maxi][i]>0)
                {
                    if(i!=0&&i!=4)
                    {
                        if(combi[maxi][i+1]==0||combi[maxi][i-1]==0)
                        {
                            temp=combi[maxi][i];i=5;
                        }
                    }
                    else if(i==0)
                    {
                        if(combi[maxi][i+1]==0)
                        {
                            temp=combi[maxi][i];i=5;
                        }
                    }
                    else if(i==4)
                    {
                        if(combi[maxi][i-1]==0)
                        {
                            temp=combi[maxi][i];i=5;
                        }
                    }
                }
            }
        }
        return(temp);
    }

    public int insane(int plbi[][],int combi[][],int bipl[],int bicom[],int move,int pl[][],int com[][],int z[])throws InterruptedException , IOException
    {
        int max[]=new int[12];
        int temp=0;
        if(move==0&&com[2][2]!=0)
        {
            temp=com[2][2];
            for(int i=0;i<5;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(pl[i][j]==com[2][2])
                        pl[i][j]=0;
                }
            }
            com[2][2]=0;
        }
        else
        { 
            for(int i=0;i<12;i++)
            {
                for(int j=0;j<5;j++)
                {
                    if(combi[i][j]==0)
                        max[i]++;
                }
            }
            int temp2=0;
            int temp3=0;
            if(temp3<5)
            {
                for(int i=0;i<12;i++)
                {
                    if(max[i]<4)
                    {
                        temp2=max[i];
                        i=12;
                    }
                }
            }
            else
            {
                for(int i=0;i<12;i++)
                {
                    if(max[i]<5)
                    {
                        temp2=max[i];
                        i=12;
                    }
                }
            }
            int maxi=0;
            int flag2=0;
            for(int i=1;i<12;i++)
            {
                if(max[i]>=temp2&&max[i]<4)
                {
                    maxi=i;
                    temp2=max[i];
                }
                else if(max[i]==4||max[i]==5)
                    temp3++;
                if(z[0]==0)
                {
                    if(temp3==5)
                    {
                        for(int j=0;j<=i;j++)
                        {
                            if(max[j]==4)
                            {
                                maxi=j;
                                z[0]++;
                            }
                        }
                    }
                }
            }                
            for(int i=0;i<5;i++)
            {
                if(combi[maxi][i]>0)
                {
                    if(i!=0&&i!=4)
                    {
                        if(combi[maxi][i+1]==0||combi[maxi][i-1]==0)
                        {
                            temp=combi[maxi][i];i=5;
                        }
                    }
                    else if(i==0)
                    {
                        if(combi[maxi][i+1]==0)
                        {
                            temp=combi[maxi][i];i=5;
                        }
                    }
                    else if(i==4)
                    {
                        if(combi[maxi][i-1]==0)
                        {
                            temp=combi[maxi][i];i=5;
                        }
                    }
                }
            }
        }
        return(temp);
    }

    public void print(int p[][])
    {
        for(int i=0;i<5;i++)
        {
            System.out.println();
            for(int j=0;j<5;j++)
            { 
                if(p[i][j]<10)
                    System.out.print("     "+p[i][j]);
                else

                    System.out.print("    "+p[i][j]);
            }
            System.out.println();
        }
    }

    public void loading()throws InterruptedException , IOException
    {
        String a[]=new String[8];
        for(int i=0;i<8;i++)
        {
            if(i<=3&&i>=1)
                a[i]="█   ";
            else
                a[i]="    ";
        }
        for(int j=0;j<6;j++)
        {
            for(int i=0;i<8;i++)
            { 
                System.out.println("\n\n\n\n\n\n");
                System.out.println();
                System.out.print("                                                  ");                
                System.out.println("    "+a[0]+a[1]+a[2]);
                System.out.println();
                System.out.print("                                                  ");
                System.out.println("    "+a[7]+"    "+a[3]);
                System.out.println();
                System.out.print("                                                  ");                
                System.out.println("    "+a[6]+a[5]+a[4]);
                System.out.print(" \n  \n                                                       Loading");
                String temp="    ";
                temp=a[0];
                a[0]=a[7];
                for(int b=7;b>1;b--)
                    a[b]=a[b-1];
                a[1]=temp;
                Thread.sleep(100);
                System.out.print("\f");
            }
        }
    }

    public void print(int p[][],int bi,int temp,int pl[][])throws InterruptedException , IOException
    {
        String na="BINGO             ";
        int ran=(int)(Math.random()*17+3);
        int k=0;
        for(int a=0;a<=ran+1;a++)
        {
            System.out.print("\f");
            if(bi>0)
            {
                for(int i=0;i<bi;i++)
                {
                    System.out.print(na.charAt(i)+"    ");
                }
            }
            else
                System.out.println();
            for(int i=0;i<5;i++)
            {
                System.out.println("   \n  ");
                for(int j=0;j<5;j++)
                { 
                    if(p[i][j]>0)
                    {
                        if(p[i][j]<10)
                            System.out.print("     "+p[i][j]);
                        else

                            System.out.print("    "+p[i][j]);
                    }
                    else if(pl[i][j]!=temp&&temp>0||k==ran+1)
                        System.out.print("    "+"██");
                    else
                    {
                        if(p[i][j]<10)
                            System.out.print("     "+temp);
                        else

                            System.out.print("    "+temp);
                    }
                }
                System.out.println("     ");
            }
            if(temp>0&&k<ran)
            {
                System.out.print("\nComputer Is Thinking");
                for(int b=0;b<a%4;b++)
                {
                    System.out.print(".");
                    Thread.sleep(150);
                }
            }
            if(temp>0&&k>=ran)
                System.out.println("\nThe Computer Played "+temp+" .");  
            k++;
        }
    }

    public void endgame(int com[][],int pl[][],int com2[][],int pl2[][])throws InterruptedException , IOException
    {
        Scanner sc=new Scanner(System.in);
        Bingo2 ob=new Bingo2();
        System.out.print("\f");
        System.out.println("This Was Your And Computer's BINGO Card \n");
        System.out.println("BEFORE\n");
        System.out.println("  Player                                    Computer");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(pl2[i][j]>9)
                    System.out.print("  "+pl2[i][j]);
                else
                    System.out.print("   "+pl2[i][j]);
            }
            System.out.print("          ");
            for(int j=0;j<5;j++)
            {
                if(com2[i][j]>9)
                    System.out.print("  "+com2[i][j]);
                else
                    System.out.print("   "+com2[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("AFTER\n");
        System.out.println("  Player                                     Computer");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
            {
                if(pl[i][j]>9)
                {
                    if(pl[i][j]>0)
                        System.out.print("  "+pl[i][j]);
                    else
                        System.out.print("  ██");
                }
                else
                {
                    if(pl[i][j]>0)
                        System.out.print("   "+pl[i][j]);
                    else
                        System.out.print("  ██");
                }
            }
            System.out.print("          ");
            for(int j=0;j<5;j++)
            {
                if(com[i][j]>9)
                {
                    if(com[i][j]>0)
                        System.out.print("  "+com[i][j]);
                    else
                        System.out.print("  ██");
                }
                else
                {
                    if(com[i][j]>0)
                        System.out.print("   "+com[i][j]);
                    else
                        System.out.print("  ██");
                }
            }
            System.out.println("\n");
        } 
        System.out.println("To Continue Press Enter");
        String sdf=sc.nextLine();
        System.out.println("Do You Want To Play Again??\n");
        System.out.println("Yes Or No");
        String ch="";
        ch=sc.next();
        if(ch.equalsIgnoreCase("yes"))
        {
            ob.game();
        }
        else if(ch.equalsIgnoreCase("no"))
        {
            System.out.println("Nice Playing With You\nGood Bye");
            Thread.sleep(5000);
            Runtime.getRuntime().exit(0); 
        }
        else
        {
            System.out.print("\f");
            System.out.println("Enter Properly");
            ob.endgame(com,pl,com2,pl2);
        }
    }
}

