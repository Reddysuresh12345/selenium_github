package Practice;

import java.time.LocalDateTime;

public interface IAutoconstants {
	String EXCELPATH="./src/test/resources/data.xlsx";
	String JDBC_URL="jdbc:mysql://localhost:3306/advanceselenium";
	String JDBC_UN="root";
	String JDBC_PW="root";
	String PROPERTYFILE_PATH="./src/test/java/commondata.properties";
	String SSPATH="./reports/";
	String TIME=LocalDateTime.now().toString().replace(":", "-");
	String DIRECTORY=System.getProperty("user.dir");
}
