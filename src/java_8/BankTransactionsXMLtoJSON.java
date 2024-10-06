/*
 * package java_8;
 * 
 * import com.fasterxml.jackson.databind.JsonNode; import
 * com.fasterxml.jackson.databind.ObjectMapper; import
 * com.fasterxml.jackson.dataformat.xml.XmlMapper;
 * 
 * public class BankTransactionsXMLtoJSON { public static void main(String[]
 * args) { try { // Sample XML string representing bank transactions String xml
 * = """ <bankTransactions> <transaction> <transactionId>001</transactionId>
 * <date>2024-08-01</date> <amount>500.00</amount> <type>Deposit</type>
 * <description>Salary</description> </transaction> <transaction>
 * <transactionId>002</transactionId> <date>2024-08-02</date>
 * <amount>100.00</amount> <type>Withdrawal</type> <description>ATM
 * withdrawal</description> </transaction> <transaction>
 * <transactionId>003</transactionId> <date>2024-08-03</date>
 * <amount>50.00</amount> <type>Transfer</type> <description>Transfer to
 * savings</description> </transaction> </bankTransactions> """;
 * 
 * // Create XmlMapper to read XML XmlMapper xmlMapper = new XmlMapper();
 * JsonNode node = xmlMapper.readTree(xml.getBytes());
 * 
 * // Create ObjectMapper to convert JsonNode to JSON string ObjectMapper
 * jsonMapper = new ObjectMapper(); String json =
 * jsonMapper.writerWithDefaultPrettyPrinter().writeValueAsString(node);
 * 
 * // Print JSON output System.out.println(json); } catch (Exception e) {
 * e.printStackTrace(); } } }
 * 
 */