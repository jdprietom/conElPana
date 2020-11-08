
/**
 * Use los comentarios para explicar el objetivo de este programa HowOldAreYou .
 *
 * @author (José Gabriel Fuentes Chona, josegabrielfc@ufps.edu.co)
 * @version (04/11/2020)
 */
public class HowOldAreYou
{
    //  birth date = bDate1
	//  current date = cDate2
    long bDate1, cDate2;

    long year1, month1, days1, year2, month2, days2;
    long age;

    boolean baby, parvulo, infant, teen, studentU, graduate;
    boolean leapYear1, feb1, date1, leapYear2, feb2, date2;

    void algoritmo( ){
      
      	year1 = bDate1%10000;
        bDate1 = bDate1/10000;
        month1 = bDate1%100;
        bDate1 = bDate1/100;
        days1 = bDate1%100;

        year2 = cDate2%10000;
        cDate2 = cDate2/10000;
        month2 = cDate2%100;
        cDate2 = cDate2/100;
        days2 = cDate2%100;

        age = year2-year1;

        baby = age<3;
        parvulo = age>=3 & age<6;
        infant = age>=6 & age<10;
        teen = age>=10 & age<17;
        studentU = age>=17 & age<25;
        graduate = age>=25;

        leapYear1 = year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0;
        feb1 = ((leapYear1) & ((days1<=29 & days1>=1)  & month1==2)) || ((days1<=28 & days1>=1) & (month1==2));

        date1 = ((days1<=30 & days1>=1) & (month1==11 | month1==4 | month1==6 | month1==9)) | 
        ((days1<=31 & days1>=1) & (month1==1 | month1==3 | month1==5 | month1==7 | month1==8 | month1==10 | month1==12)) | (feb1);

        leapYear2 = year2 % 4 == 0 && year2 % 100 != 0 || year2 % 400 == 0;
        feb2 = ((leapYear2) & ((days2<=29 & days2>=1)  & month2==2)) || ((days2<=28 & days2>=1) & (month2==2));

        date2 = ((days2<=30 & days1>=2) & (month2==11 | month2==4 | month2==6 | month2==9)) | 
        ((days2<=31 & days2>=1) & (month2==1 | month2==3 | month2==5 | month2==7 | month2==8 | month2==10 | month2==12)) | (feb2);

    
    }//fin method
    
}//fin class HowOldAreYou
