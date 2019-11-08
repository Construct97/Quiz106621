package quiz;

public class Model {
    public String question;
    public String odpa;
    public String odpb;
    public String odpc;
    public String odpd;
    public char rightAnswer;
    public int questionNumber;
    public char userAnswer;
    

    	Model(String question , String odpa , String odpbB ,
              String odpc , String odpd , char rightAnswer , int questionNumber){
        	this.odpa = odpa;
        this.question = question;
        this.odpb = odpbB;
        this.odpc = odpc;
        this.odpd = odpd;
        this.rightAnswer =rightAnswer;
        this.questionNumber =questionNumber;
    }
}