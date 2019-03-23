import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;  
import javax.xml.bind.annotation.XmlElement;  
import javax.xml.bind.annotation.XmlRootElement;  
  
@XmlRootElement  
public class Question {  
private int id;  
private String questionname; 
private String creation_date;
private String report_date;
private List<Answer> answers;  
public Question() {}  
public Question(int id, String report_date,String creation_date,String questionname, List<Answer> answers) {  
    super();  
    this.id = id;  
    this.report_date=report_date;
    this.creation_date=creation_date;
    this.questionname = questionname;  
    this.answers = answers;  
}  
@XmlAttribute  
public int getId() {  
    return id;  
}  
public void setId(int id) {  
    this.id = id;  
}  

@XmlElement  
public String getCreation_date() {  
    return creation_date;  
}  
public void setCreation_date(String creation_date) {  
	this.creation_date=creation_date;
}

@XmlElement  
public String getreport_date() {  
    return report_date;  
}  
public void setreport_date(String report_date) {  
    this.report_date = report_date;  
}    

@XmlElement  
public String getQuestionname() {  
    return questionname;  
}  
public void setQuestionname(String questionname) {  
    this.questionname = questionname;  
}  
@XmlElement  
public List<Answer> getAnswers() {  
    return answers;  
}  
public void setAnswers(List<Answer> answers) {  
    this.answers = answers;  
}  
}  