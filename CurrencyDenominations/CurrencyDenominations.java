package CurrencyDenominations;

public class CurrencyDenominations {
	public void notesCountImplementation(int[] notes,int amount) {
		int[] notecounter=new int[notes.length];
		try {
			//int no_of_notes=0;
			for(int i=0;i<notes.length;i++) {
				if(amount>=notes[i]) {
					notecounter[i]=amount/notes[i];
					//no_of_notes+=amount/notes[i];
					amount=amount-notecounter[i]*notes[i];
				}
			}
			if(amount>0) {
				System.out.println("Exact amount cannot be given with highest denomination");
			}else {
				System.out.println("Your payment approach in order to give minimum no of notes will be:");
				for(int i=0;i<notes.length;i++) {
					if(notecounter[i]!=0) {
						System.out.println(notes+""+notecounter[i]);
					}
				}
			}
		}catch(ArithmeticException e) {
			System.out.println(e+ "notes of denomination 0 is invalid");
		}
	}
}	