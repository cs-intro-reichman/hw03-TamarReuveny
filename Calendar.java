/** 
 * Prints the calendars of all the years in the 20th century.
 */
public class Calendar {

    // Starting the calendar on 1/1/1900
	static int dayOfMonth = 1;   
	static int month = 1;
	static int year = 1900;
	static int nDaysInMonth = 31; // Number of days in January
	
	/** 
	 * Prints the calendars of all the years in the 20th century. Also prints the  
	 * number of Sundays that occured on the first day of the month during this period.
	 */
	public static void main(String args[]) {

		int y = Integer.parseInt(args[0]);

		// Advances the date and the day-of-the-week from 1/1/1900 till 31/12/1999, inclusive.
	    // Prints each date dd/mm/yyyy in a separate line. If the day is a Sunday, prints "Sunday".
	    // The following variable, used for debugging purposes, counts how many days were advanced so far.
	    //// Write the necessary initialization code, and replace the condition
	    //// of the while loop with the necessary condition
		
		if (year >= y) {

			year++;
		}

	 	while (year <= y) {

			year = y;
	 		//// Write the body of the while 		
	 		advance();

			year++;
	 		
        }
	 	//// Write the necessary ending code here
	 }
	
	 // Advances the date (day, month, year) and the day-of-the-week.
	 // If the month changes, sets the number of days in this month.
	 // Side effects: changes the static variables dayOfMonth, month, year, dayOfWeek, nDaysInMonth.
	 private static void advance() {

			while (month <= 12) {

			    while (dayOfMonth <= nDaysInMonth) {

			     	System.out.println(dayOfMonth + "/" + month + "/" + year);

					dayOfMonth ++;

					}

					month++;	

					nDaysInMonth = nDaysInMonth(month,year);

					dayOfMonth = 1;
				
			}

			year++;
		
         }

	 
		 
    // Returns true if the given year is a leap year, false otherwise.
	private static boolean isLeapYear(int year) {

		if (year % 4 == 0) {

			return true;

		} else {

			return false;

		}
		}
		
	 
	// Returns the number of days in the given month and year.
	// April, June, September, and November have 30 days each.
	// February has 28 days in a common year, and 29 days in a leap year.
	// All the other months have 31 days.
	private static int nDaysInMonth(int month, int year) {

		int numbeOfDays;

		if (month == 4 || month == 6 || month == 9 || month == 11) {

			numbeOfDays = 30;

		} else if (month == 2) {

			if (isLeapYear(year)) {

				numbeOfDays = 29;
			} else {

					numbeOfDays = 28;
				}

			} else {

			numbeOfDays = 31;
		}

		return numbeOfDays;
		
		}
	
	}
