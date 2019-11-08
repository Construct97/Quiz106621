package quiz;

public class glowa {

	public static void main(String[] args) {
System.out.println("Weclome ! ");
		Data data = new Data();
		int complett = 0;
for(Model anwor : data.list){
   	System.out.println("Tutaj pytanie  : " + anwor.questionNumber);
   System.out.println(anwor.question);
   	System.out.println("a): " + anwor.odpa);
   				System.out.println("b): " + anwor.odpb);
   	System.out.println("c): " + anwor.odpc);
   System.out.println("d): " + anwor.odpd);
   Scan Scan = new Scan();
   char answer = Scan.Answer();
   		if(answer == 'q'){
       System.out.println("Za szybko zwolij!! " + complett);
       return;
   }
   System.out.println(anwor.rightAnswer);
   	if(answer == anwor.rightAnswer){
       System.out.println("GOODD!");
       complett++;
   }
   else{
       System.out.println("WROND !");
   }
   			System.out.println("Wynik to : " + complett);
   			if(anwor.questionNumber == data.list.size()){
       System.out.println("Konczysz z pkt: " + complett);
       return ;
   }
   			if(anwor.questionNumber != data.list.size()) {
       System.out.println("jak jestes miêczak to wcisnij q");
   }

   
}
}
}