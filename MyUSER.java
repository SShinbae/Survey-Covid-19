import java.util.*;
public class MyUSER
{
    static void register ()
    {
        String name, email, IC, phonenum;

        Scanner a = new Scanner (System.in);
        Scanner b = new Scanner (System.in);
		
		System.out.println();
		
        System.out.print ("ENTER FULL NAME: ");
        name = a.nextLine();

		System.out.println();

        System.out.print ("ENTER IC NUMBER: ");
        IC = b.nextLine();

		System.out.println();

        System.out.print ("ENTER PHONE NUMBER: ");
        phonenum = b.nextLine();

		System.out.println();

        System.out.print ("ENTER EMAIL: ");
        email = a.nextLine();
		
		System.out.println();
	}
		static void question ()
		{
			char answer;
			int count = 0;
			
			Scanner b = new Scanner (System.in);
			
			System.out.print ("WOULD YOU LIKE TO UPDATE YOUR COVID-19 STATUS? (Y/N): ");
			answer = b.next().charAt(0);
        
			System.out.println();
		
            switch (answer)
            {
				case 'Y':
				System.out.println ("1. ARE YOU EXPERIENCING 2 OR MORE SYMPTOM?");
                System.out.println ("  (FEVER, SORE THROAT, HEADACHE, NAUSEA, DIARRHEA, RUNNY NOSE, BODY ACHE)");
				
				System.out.println();
				
                System.out.print ("Answer (Y/N): ");
                answer = b.next().charAt(0);
				
				if (answer=='Y'||answer=='y')
				{
					count=count + 1;
				}
				
				else
				{
					count=count + 0;
				}
				
				System.out.println();
				
				System.out.println ("2. HAVE YOU EVER BEEN IN A CLOSE CONTACT WITH COVID-19 SUSPECT OR PATIENT?");
				
				System.out.println();
				
                System.out.print ("Answer (Y/N): ");
                answer = b.next().charAt(0);
				
				if (answer=='Y'||answer=='y')
				{
					count=count + 1;
				}
				
				else
				{
					count=count + 0;
				}
				
				System.out.println();
				
				System.out.println ("3. HAVE YOU EVER BEEN TO A PLACE THAT HAS BEEN KNOWN WITH COVID-19 CLUSTERS?");
				
				System.out.println();
				
                System.out.print ("Answer (Y/N): ");
                answer = b.next().charAt(0);
				
				if (answer=='Y'||answer=='y')
				{
					count=count + 1;
				}
				
				else
				{
					count=count + 0;
				}
				
				System.out.println();
				
				if (count>=1)
				{
					
					System.out.println ("HIGH RISK. YOU WILL BE CONTACTED SOON.");
				}
				
				else
				{
					System.out.println ("LOW RISK. STAY SAFE.");
				}
				
				break;
				
				case 'y':
					System.out.println ("1. ARE YOU EXPERIENCING 2 OR MORE SYMPTOM?");
                System.out.println ("  (FEVER, SORE THROAT, HEADACHE, NAUSEA, DIARRHEA, RUNNY NOSE, BODY ACHE)");
				
				System.out.println();
				
                System.out.print ("Answer (Y/N): ");
                answer = b.next().charAt(0);
				
				if (answer=='Y'||answer=='y')
				{
					count=count + 1;
				}
				
				else
				{
					count=count + 0;
				}
				
				System.out.println();
				
				System.out.println ("2. HAVE YOU EVER BEEN IN A CLOSE CONTACT WITH COVID-19 SUSPECT OR PATIENT?");
				
				System.out.println();
				
                System.out.print ("Answer (Y/N): ");
                answer = b.next().charAt(0);
				
				if (answer=='Y'||answer=='y')
				{
					count=count + 1;
				}
				
				else
				{
					count=count + 0;
				}
				
				System.out.println();
				
				System.out.println ("3. HAVE YOU EVER BEEN TO A PLACE THAT HAS BEEN KNOWN WITH COVID-19 CLUSTERS?");
				
				System.out.println();
				
                System.out.print ("Answer (Y/N): ");
                answer = b.next().charAt(0);
				
				if (answer=='Y'||answer=='y')
				{
					count=count + 1;
				}
				
				else
				{
					count=count + 0;
				}
				
				System.out.println();
				
				if (count>=1)
				{
					
					System.out.println ("HIGH RISK. YOU WILL BE CONTACTED SOON.");
				}
				
				else
				{
					System.out.println ("LOW RISK. STAY SAFE.");
					System.out.println ();
					System.out.println ("KITA JAGA KITA");
				}
	
                break;

                default:
                System.out.println ("OK");
				System.out.println ();
				System.out.println ("KITA JAGA KITA");
            }
		}

 
public static void main (String [] args)
 {
	register ();
	question ();
 }	
}