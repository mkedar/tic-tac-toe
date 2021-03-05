import java.util.Scanner;

//Matan Kedar
//06.15.20
// (I did this before I learned arreys and for loops)

public class tic-tac-toe
{
    public static void main(String[] args)
    {


        String player1;
        String player2;

        double a = 1;     String j ="_";
        double b = 2;     String k ="_";
        double c = 3;     String l ="_";
        double d = 4;     String m ="_";
        double e = 5;     String n ="_";
        double f = 6;     String o ="_";
        double g = 7;     String p =" ";
        double h = 8;     String q =" ";
        double i = 9;     String r =" ";


        Scanner input = new Scanner(System.in);
        System.out.println("Enter first player name ");
        player1 = input.nextLine();

        System.out.println("Enter second player name. ");
        player2 = input.nextLine();


        System.out.println(" ");
        System.out.println("1_|_2_|_3_ ");
        System.out.println("4_|_5_|_6_" );
        System.out.println("7 | 8 | 9  ");
        System.out.println(" ");



/////////////////////first round/////////////////////////////////

        System.out.println(player1 + " goes first, pick a number between 1 to 9." );
        int first = input.nextInt();

        if (first == a){  //1.1
            a *=11;
            j = j.replace("_","x");
        }

        if (first == b){  //1.2
            b *=22;
            k = k.replace("_","x");
        }
        if (first == c){  //1.3
            c *=33;
            l = l.replace("_","x");
        }
        if (first == d){  //1.4
            d *=44;
            m = m.replace("_","x");
        }
        if (first == e){  //1.5
            e *=55;
            n = n.replace("_","x");
        }
        if (first == f){  //1.6
            f *=66;
            o = o.replace("_","x");
        }
        if (first == g){  //1.7
            g *=77;
            p = p.replace(" ","x");
        }
        if (first == h){  //1.8
            h *=88;
            q = q.replace(" ","x");
        }
        if (first == i){  //1.9
            i *=99;
            r = r.replace(" ","x");
        }
        if (first > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

/////////////////////second round/////////////////////////////////  

        System.out.println(player2 + "'s turn, pick a number between 1 to 9." );
        int second = input.nextInt();


        if (second == a){  //2.1
            a *=111;
            j = j.replace("_","o");
        }

        if (second == b){  //2.2
            b *=222;
            k = k.replace("_","o");
        }
        if (second == c){  //2.3
            c *=333;
            l = l.replace("_","o");
        }
        if (second == d){  //2.4
            d *=444;
            m = m.replace("_","o");
        }
        if (second == e){  //2.5
            e *=555;
            n = n.replace("_","o");
        }
        if (second == f){  //2.6
            f *=666;
            o = o.replace("_","o");
        }
        if (second == g){  //2.7
            g *=777;
            p = p.replace(" ","o");
        }
        if (second == h){  //2.8
            h *=888;
            q = q.replace(" ","o");
        }
        if (second == i){  //2.9
            i *=999;
            r = r.replace(" ","o");
        }
        if (second > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == second){
            System.out.println("Do not pick the same number");
            return;
        }

/////////////////////third round/////////////////////////////////  

        System.out.println(player1 + "'s turn." );
        int third = input.nextInt();

        if (third == a){  //3.1
            a *=11;
            j = j.replace("_","x");
        }

        if (third == b){  //3.2
            b *=22;
            k = k.replace("_","x");
        }
        if (third == c){  //3.3
            c *=33;
            l = l.replace("_","x");
        }
        if (third == d){  //3.4
            d *=44;
            m = m.replace("_","x");
        }
        if (third == e){  //3.5
            e *=55;
            n = n.replace("_","x");
        }
        if (third == f){  //3.6
            f *=66;
            o = o.replace("_","x");
        }
        if (third == g){  //3.7
            g *=77;
            p = p.replace(" ","x");
        }
        if (third == h){  //3.8
            h *=88;
            q = q.replace(" ","x");
        }
        if (third == i){  //3.9
            i *=99;
            r = r.replace(" ","x");
        }
        if (third > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == third){
            System.out.println("Do not pick the same number");
            return;
        }
        if (third == second){
            System.out.println("Do not pick the same number");
            return;
        }

/////////////////////fourth round/////////////////////////////////  

        System.out.println(player2 + "'s turn." );
        int fourth = input.nextInt();


        if (fourth == a){  //4.1
            a *=111;
            j = j.replace("_","o");
        }
        if (fourth == b){  //4.2
            b *=222;
            k = k.replace("_","o");
        }
        if (fourth == c){  //4.3
            c *=333;
            l = l.replace("_","o");
        }
        if (fourth == d){  //4.4
            d *=444;
            m = m.replace("_","o");
        }
        if (fourth == e){  //4.5
            e *=555;
            n = n.replace("_","o");
        }
        if (fourth == f){  //4.6
            f *=666;
            o = o.replace("_","o");
        }
        if (fourth == g){  //4.7
            g *=777;
            p = p.replace(" ","o");
        }
        if (fourth == h){  //4.8
            h *=988;
            q = q.replace(" ","o");
        }
        if (fourth == i){  //4.9
            i *=999;
            r = r.replace(" ","o");
        }
        if (fourth > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == fourth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (second == fourth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (third == fourth){
            System.out.println("Do not pick the same number");
            return;
        }

/////////////////////fifth round/////////////////////////////////      


        System.out.println(player1 + "'s turn." );
        int fifth = input.nextInt();

        if (fifth == a){  //5.1
            a *=11;
            j = j.replace("_","x");
        }
        if (fifth == b){  //5.2
            b *=22;
            k = k.replace("_","x");
        }
        if (fifth == c){  //5.3
            c *=33;
            l = l.replace("_","x");
        }
        if (fifth == d){  //5.4
            d *=44;
            m = m.replace("_","x");
        }
        if (fifth == e){  //5.5
            e *=55;
            n = n.replace("_","x");
        }
        if (fifth == f){  //5.6
            f *=66;
            o = o.replace("_","x");
        }
        if (fifth == g){  //5.7
            g *=77;
            p = p.replace(" ","x");
        }
        if (fifth == h){  //5.8
            h *=88;
            q = q.replace(" ","x");
        }
        if (fifth == i){  //5.9
            i *=99;
            r = r.replace(" ","x");
        }
        if (fifth > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == fifth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (second == fifth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (third == fifth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fourth == fifth){
            System.out.println("Do not pick the same number");
            return;
        }

        // winning mechanism

        if (a + d + g == 726.0){
            System.out.println(player1 + " WINS!");
            return;

        }
        if (a + b + c == 154.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (g + h + i == 2134.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (c + f + i == 1386.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (a + e + i == 1177.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (d + e + f == 847.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (b + e + h == 1023.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (c + e + g == 913.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        else{
            System.out.println("");
        }
        /////////////////////sixth round/////////////////////////////////

        System.out.println(player2 + "'s turn." );
        int sixth = input.nextInt();


        if (sixth == a){  //6.1
            a *=111;
            j = j.replace("_","o");
        }
        if (sixth == b){  //6.2
            b *=222;
            k = k.replace("_","o");
        }
        if (sixth == c){  //6.3
            c *=333;
            l = l.replace("_","o");
        }
        if (sixth == d){  //6.4
            d *=444;
            m = m.replace("_","o");
        }
        if (sixth == e){  //6.5
            e *=555;
            n = n.replace("_","o");
        }
        if (sixth == f){  //6.6
            f *=666;
            o = o.replace("_","o");
        }
        if (sixth == g){  //6.7
            g *=777;
            p = p.replace(" ","o");
        }
        if (sixth == h){  //6.8
            h *=888;
            q = q.replace(" ","o");
        }
        if (sixth == i){  //6.9
            i *=999;
            r = r.replace(" ","o");
        }
        if (sixth > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == sixth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (second == sixth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (third == sixth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fourth == sixth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fifth == sixth){
            System.out.println("Do not pick the same number");
            return;
        }

        // winning mechanism

        if (a + d + g == 7326.0){
            System.out.println(player2 + " WINS!");
            return;

        }
        if (a + b + c == 1554.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (g + h + i == 22334.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (c + f + i == 13986.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (a + e + i == 11877.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (d + e + f == 8547.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (b + e + h == 10323.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (c + e + g == 9213.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        else{
            System.out.println("");
        }

        /////////////////////seventh round/////////////////////////////////

        System.out.println(player1 + "'s turn." );
        int seventh = input.nextInt();

        if (seventh == a){  //7.1
            a *=11;
            j = j.replace("_","x");
        }
        if (seventh == b){  //7.2
            b *=22;
            k = k.replace("_","x");
        }
        if (seventh == c){  //7.3
            c *=33;
            l = l.replace("_","x");
        }
        if (seventh == d){  //7.4
            d *=44;
            m = m.replace("_","x");
        }
        if (seventh == e){  //7.5
            e *=55;
            n = n.replace("_","x");
        }
        if (seventh == f){  //7.6
            f *=66;
            o = o.replace("_","x");
        }
        if (seventh == g){  //7.7
            g *=77;
            p = p.replace(" ","x");
        }
        if (seventh == h){  //7.8
            h *=88;
            q = q.replace(" ","x");
        }
        if (seventh == i){  //7.9
            i *=99;
            r = r.replace(" ","x");
        }
        if (seventh > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == seventh){
            System.out.println("Do not pick the same number");
            return;
        }
        if (second == seventh){
            System.out.println("Do not pick the same number");
            return;
        }
        if (third == seventh){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fourth == seventh){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fifth == seventh){
            System.out.println("Do not pick the same number");
            return;
        }
        if (sixth == seventh){
            System.out.println("Do not pick the same number");
            return;
        }

        // winning mechanism

        if (a + d + g == 726.0){
            System.out.println(player1 + " WINS!");
            return;

        }
        if (a + b + c == 154.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (g + h + i == 2134.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (c + f + i == 1386.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (a + e + i == 1177.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (d + e + f == 847.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (b + e + h == 1023.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (c + e + g == 913.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        else{
            System.out.println("");
        }

        /////////////////////eighth round/////////////////////////////////

        System.out.println(player2 + "'s turn." );
        int eighth = input.nextInt();


        if (eighth == a){  //6.1
            a *=111;
            j = j.replace("_","o");
        }
        if (eighth == b){  //6.2
            b *=222;
            k = k.replace("_","o");
        }
        if (eighth == c){  //6.3
            c *=333;
            l = l.replace("_","o");
        }
        if (eighth == d){  //6.4
            d *=444;
            m = m.replace("_","o");
        }
        if (eighth == e){  //6.5
            e *=555;
            n = n.replace("_","o");
        }
        if (eighth == f){  //6.6
            f *=666;
            o = o.replace("_","o");
        }
        if (eighth == g){  //6.7
            g *=777;
            p = p.replace(" ","o");
        }
        if (eighth == h){  //6.8
            h *=888;
            q = q.replace(" ","o");
        }
        if (eighth == i){  //6.9
            i *=999;
            r = r.replace(" ","o");
        }
        if (eighth > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == eighth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (second == eighth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (third == eighth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fourth == eighth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fifth == eighth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (sixth == eighth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (seventh == eighth){
            System.out.println("Do not pick the same number");
            return;
        }

        // winning mechanism

        if (a + d + g == 7326.0){
            System.out.println(player2 + " WINS!");
            return;

        }
        if (a + b + c == 1554.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (g + h + i == 22334.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (c + f + i == 13986.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (a + e + i == 11877.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (d + e + f == 8547.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (b + e + h == 10323.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        if (c + e + g == 9213.0){
            System.out.println(player2 + " WINS!");
            return;
        }
        else{
            System.out.println("");
        }

        /////////////////////ninth round/////////////////////////////////

        System.out.println(player1 + "'s turn." );
        int ninth = input.nextInt();

        if (ninth == a){  //7.1
            a *=11;
            j = j.replace("_","x");
        }
        if (ninth == b){  //7.2
            b *=22;
            k = k.replace("_","x");
        }
        if (ninth == c){  //7.3
            c *=33;
            l = l.replace("_","x");
        }
        if (ninth == d){  //7.4
            d *=44;
            m = m.replace("_","x");
        }
        if (ninth == e){  //7.5
            e *=55;
            n = n.replace("_","x");
        }
        if (ninth == f){  //7.6
            f *=66;
            o = o.replace("_","x");
        }
        if (ninth == g){  //7.7
            g *=77;
            p = p.replace(" ","x");
        }
        if (ninth == h){  //7.8
            h *=88;
            q = q.replace(" ","x");
        }
        if (ninth == i){  //7.9
            i *=99;
            r = r.replace(" ","x");
        }
        if (ninth > 9){
            System.out.println("Number must be between 1 to 9.");
        }

        System.out.println("");
        System.out.println(j+"_|_"+k+"_|_"+l+"_");
        System.out.println(m+"_|_"+n+"_|_"+o+"_" );
        System.out.println(p+" | "+q+" | "+r+ ""  );
        System.out.println("");

        if (first == ninth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (second == ninth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (third == ninth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fourth == ninth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (fifth == ninth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (sixth == ninth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (seventh == ninth){
            System.out.println("Do not pick the same number");
            return;
        }
        if (eighth == ninth){
            System.out.println("Do not pick the same number");
            return;
        }

        // winning mechanism

        if (a + d + g == 726.0){
            System.out.println(player1 + " WINS!");
            return;

        }
        if (a + b + c == 154.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (g + h + i == 2134.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (c + f + i == 1386.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (a + e + i == 1177.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (d + e + f == 847.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (b + e + h == 1023.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        if (c + e + g == 913.0){
            System.out.println(player1 + " WINS!");
            return;
        }
        else{
            System.out.println("DRAW!");
            return;
        }

















    }
}
