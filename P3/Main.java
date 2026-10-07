interface Question{boolean evaluate(String answer);}
class MCQ implements Question{String correct;MCQ(String c){correct=c;}public boolean evaluate(String a){return correct.equals(a);}}
class TrueFalse implements Question{boolean correct;TrueFalse(boolean c){correct=c;}public boolean evaluate(String a){return Boolean.parseBoolean(a)==correct;}}
class ShortAnswer implements Question{String correct;ShortAnswer(String c){correct=c;}public boolean evaluate(String a){return correct.equalsIgnoreCase(a.trim());}}
class Student{String name;Student(String n){name=n;}}
class Examination{String title;Examination(String t){title=t;}}
class Attempt{Student s;Examination e;java.util.Map<Question,String> answers=new java.util.HashMap<>();boolean submitted;Attempt(Student s,Examination e){this.s=s;this.e=e;}void answer(Question q,String a){if(submitted)throw new IllegalStateException("Answers locked");answers.put(q,a);}int submit(){if(submitted)throw new IllegalStateException("Already submitted");submitted=true;int score=0;for(var x:answers.entrySet())if(x.getKey().evaluate(x.getValue()))score++;return score;}}
public class Main{public static void main(String[]a){Attempt x=new Attempt(new Student("Asha"),new Examination("OOP"));x.answer(new MCQ("B"),"B");System.out.println(x.submit());}}