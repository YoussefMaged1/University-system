
public class Student {
	private String f_name; 
    private String m_name; 
    private String l_name; 
    private String gender; 
    private String Nationality; 
    private String reg_num; 
    private int num; 
 
    public Student(String f_name, String m_name, String l_name, String gender, String Nationality,String reg_num, int num) { 
        this.f_name = f_name; 
        this.m_name = m_name; 
        this.l_name = l_name; 
        this.gender = gender; 
        this.Nationality = Nationality; 
        this.reg_num = reg_num; 
        this.num = num; 
    } 
     
 
    public String getF_name() { 
        return f_name; 
    } 
 
    public void setF_name(String f_name) { 
        this.f_name = f_name; 
    } 
 
    public String getM_name() { 
        return m_name; 
    } 
 
    public void setM_name(String m_name) { 
        this.m_name = m_name; 
    } 
 
    public String getL_name() { 
        return l_name; 
    } 
 
    public void setL_name(String l_name) { 
        this.l_name = l_name; 
    } 
 
    public String getGender() { 
        return gender; 
    } 
 
    public void setGender(String gender) { 
        this.gender = gender; 
    } 
 
 
    public String getNationality() { 
        return Nationality; 
    } 
 
    public void setNationality(String Nationality) { 
        this.Nationality = Nationality; 
    } 
     
 
    public String getRegNum() { 
        return reg_num; 
    } 
 
    public void setRegNum(String reg_num) { 
        this.reg_num = reg_num; 
    } 
     
 
    public int getNum() { 
        return num; 
    } 
 
    public void setNum(int num) { 
        this.num = num; 
    } 
 
 
}


