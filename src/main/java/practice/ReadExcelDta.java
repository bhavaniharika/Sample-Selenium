package practice;



import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelDta {

public static void main(String[] args) {
// TODO Auto-generated method stub
ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\dell\\eclipse-workspace\\groupid\\src\\test\\resources\\Harika IDE\\testdata.xlsx");
System.out.println(excel.getData(0, 0, 0));
System.out.println(excel.getData(0, 0, 1));
}

}