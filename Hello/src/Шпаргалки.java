public class ????????? {
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ???? ??????:
???	        ?????? ? ??????	?????? ? ?????	????????? ???????? (??..??)	                                ???????? ?? ?????????
boolean	    ?	            1	            true ??? false	                                            false
byte	    1 	            8 	            -128..   127	                                            0
short	    2 	            16 	            -32,768..   32,767	                                        0
int	        4	            32 	            -2,147,483,648..   2,147,483,647	                        0
long	    8	            64          	-9,223,372,036,854,775,808..   9,223,372,036,854,775,807	0
char	    2	            16	            0..   65,535	                                            '\u0000'
float	    4	            32	            -3.4E+38..   3.4E+38 (???????? IEEE 754)	                0.0
double	    8	            64	            -1.7E+308..   1.7E+308 (???????? IEEE 754)	                0.0         */
    /*-----------------------------------------------------------------------------------------------------------------*/
//          ???????????? ???????:
//          private  - ????????? ? ?????? ??????.
//          protected ? ????????? ? ?????? ?????? ? ???????????.
//          default - ????????? ? ?????? ??????.
//          public ? ????????? ??? ????
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          public static void main(String[] args) {
}           ???? ????? ???????? ?????? ????? ? ?????????                                                            */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ???????? ??????? (?????????? ??????):
            new House();
            ?????????? ?????????? ?????? ?? ??????? (?????????? ??????:
            House  house = new House();                                                                             */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????? ???????:
            House  house = new House();
            house.setTemperature(18);
            house.getTemperature();                                                                                 */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ???????? ?????????????? ?????????:
            ????????    	????????
            +	            ???????? (? ????? ??????? ????)
            -	            ????????? (? ????? ??????? ?????)
            *	            ?????????
            /	            ???????
            %	            ??????? ?? ??????*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????? ?????????????? ???????? ? ?????????????:
            ????????    	????????
            +=	            ???????? ? ?????????????
            -=	            ????????? ? ?????????????
            *=	            ????????? ? ?????????????
            /=	            ??????? ? ?????????????
            %=	            ??????? ?? ?????? ? ?????????????*/
    /*-----------------------------------------------------------------------------------------------------------------*/
            /*????????? ?????????:
            ????????	    ????????
            ==	            ?????
            !=	            ???????
            >	            ??????
            <	            ??????
            >=	            ?????? ??? ?????
            <=	            ?????? ??? ?????*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????? ? ?????????:
            ?++;            ?????????? ?? 1 (?? ??, ??? ? = ? + 1;)
            ?--;            ?????????? ?? 1 (?? ??, ??? ? = ? - 1;*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ?????????? ?????????:
            ????????    	????????
            &	            ?????????? ???????? ? (AND) ??? ??????????
            |	            ?????????? ???????? ??? (OR) ??? ??????????
            ^	            ?????????? ???????? ??????????? ??? (XOR)
            !	            ?????????? ??????? ???????? ?? (NOT)
            ||	            ??????????? ?????????? ???????? ??? (short-circuit)
            &&	            ??????????? ?????????? ???????? ? (short-circuit)
            ==	            ?????????
            !=	            ???????????
            &=	            ?????????? ???????? ? ? ?????????????
            |=	            ?????????? ???????? ??? ? ?????????????
            ^=	            ?????????? ???????? ??????????? ??? ? ?????????????*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????? ????????:
            ???????????? ?????? ????????? if-else
            ????? ????? ?????????? ?????????:
            ?????????1 ? ?????????2 : ?????????3
            ????????
            k = i < 0 ? -i : i;                                                                                    */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ???????? ????????????:
            ?????????? = ?????????;
            ????????:
            ? = ? = z = 100;                                                                                      */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????? ????????:
            1.      ]	    ()	    .
            2.      ++	    --	    ~	    !	    +(???????)	    - (???????)	    (?????????? ?????)
            3.      *	    /	    %
            4.      +	    -
            5.      >>	    >>>	    <<
            6.      >	    >=	    <	    <=	    instanceof
            7.      ==	    !=
            8.      &
            9.      ^
            10.     |
            11.     &&
            12.     ||
            13.     ? :
            14.     ->
            15      =                                                                                            */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????? (???????????) ????????
            ????????        ????????
            ~               ??????????? ??????? ???????? ?? (??????????)
            &               ??????????? ?????????? ???????? ? (AND, ????????? ??????????)
            |               ??????????? ?????????? ???????? ??? (OR, ????????? ??????????)
            ^               ??????????? ?????????? ???????? ??????????? ??? (XOR)*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????? ??????????:

            ???????? if:

            if (???????) {
               	????????1;
            } else {
               	????????2;
            }                                                                                                               */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ???????? switch:

            switch (?????????) {
                case ????????1:
                    ?????????;
                    break;
                case ????????2:
                    ?????????;
                    break;
            default:
                ?????????;
            }                                                                                                       */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????? ? java:
            ??? ?????? - ???????????? ??? ?????????? ??????-?? ???????? ?? ??? ???, ???? ??????????? ????????? ???????
            ??? ?n-???? - ???????????? ??? ?????????? ?????-?? ???????? ??????? ????????? ?????????? ???                                                                                             */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ?????? ????? while:
            int i = 1;
            while (i < 5) {
            System.out.println(?i = ? + i);
            i++;
            }                                                                                                       */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ?????? ????? do?while
            int n = 5;
	        do {
            System.out.println("Sample : " + n);
            n--;
            } while (n > 0);                                                                                                */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ?????? ????? For:
            for (int i = 0; i < 5; i++) {
                System.out.println("Count is: " + i);
            }                                                                                                       */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????  break:
            ?? ???? ????????????? ?????????? ????? ????? ?????????? ?????????? ???.
            ??? ???? ???? ???????????? ????????? break.
            ???? ??? ??????????? ? ?????, ?? ???? ??????????? ? ?????????? ?????????? ?????????, ?????????? ????? ?????.    */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          while (i <= 28) {
                if (i % 13 == 0) {
                    break;
                }
                i++;
            }
            System.out.println(?First number is : ? + i);*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????  continue:
            ?????????? ??????????? ?????????????? ????????? ????????? ???????? ?????,
            ??????? ?????????? ??? ?????????? ??????.
            ??? ????????? ??????? ???????? continue.
            ?????? ???????? ???????? ?????????????? ??????? ?? ????????? ???????? ?????,
            ?????? ??? ??????????? ????????? ????????????.*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          for (int i = 1; i < 5; i++) {
                if (i == 3) {
                    System.out.println("continue!");
                    continue;
                }
                System.out.println(?i = ? + i);
            }                                                                                                       */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ????????  return
            ?????????? ??????????? ?????????????? ????????? ????????? ???????? ?????
            ????? ?? ???? ?????? ????????? return                                                                   */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          for (int i = 1; i <= count; i++) {
                System.out.println(i);
                if (i == 5) return;
            }
            System.out.println(????? ????????? ?? ??????);*/
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ?????????? ????????:
            int[] array;
            int array[]; (????? ? ???, ? ???)
            ????????????? ????????:
            array = new int[10];
            ????????? ????????????? ??????? (????? ? ????????, ? ????????????????):
            int[] array = {1,2,3,4,5};                                                                              */
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*          array.length - ?????? ??????? array                                                                     */
    /*-----------------------------------------------------------------------------------------------------------------*/
/*          ??? ?????? ???? String:
            \n - ??????? ??????
            \t - ?????????
            \r - ??????? ???????                                                                                    */
    /*-----------------------------------------------------------------------------------------------------------------*/
    /*      ???????? ???

            ?????????? ? ????????? ????????? ?? ?? ??????????;
            ??????????? ? ??? ??????????? ??????? ????????? ????????? ?????;
            ???????????? ? ??????????? ??????? ???????????? ?? ?????? ???????;
            ???????????? ?????????????? ??????? ? ???????? ? ???????.*/
    /*-----------------------------------------------------------------------------------------------------------------*/

}


