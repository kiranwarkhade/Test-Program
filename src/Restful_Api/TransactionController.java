/*
 * package Restful_Api;
 * 
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.data.domain.PageRequest; import
 * org.springframework.data.domain.Pageable; import
 * org.springframework.http.HttpStatus; import
 * org.springframework.http.ResponseEntity; import
 * org.springframework.web.bind.annotation.GetMapping; import
 * org.springframework.web.bind.annotation.RequestParam; import
 * org.springframework.web.bind.annotation.RequestMapping; import
 * org.springframework.web.bind.annotation.RestController;
 * 
 * import java.util.ArrayList; import java.util.List;
 * 
 * @RestController
 * 
 * @RequestMapping("/transaction") public class TransactionController {
 * 
 * private final TransactionService transactionService; private final
 * TransactionPhpService transactionPhpService;
 * 
 * @Autowired public TransactionController(TransactionService
 * transactionService, TransactionPhpService transactionPhpService) {
 * this.transactionService = transactionService; this.transactionPhpService =
 * transactionPhpService; }
 * 
 * // To get list of transactions for selected user
 * 
 * @GetMapping(value = "/userLatestTransaction", produces = "application/json")
 * public ResponseEntity<List<GrsTransaction>>
 * getUserLatestTransaction(@RequestParam("senderId") String senderId) {
 * Pageable pageable = PageRequest.of(0, 5);
 * 
 * List<Transaction> transactions =
 * transactionService.findUserLatestTransaction(senderId, pageable);
 * List<TransactionPhp> phpTransactions =
 * transactionPhpService.findUserLatestTransaction(senderId, pageable);
 * 
 * List<GrsTransaction> grsTransactions = new ArrayList<>();
 * grsTransactions.addAll(transactions);
 * grsTransactions.addAll(phpTransactions);
 * 
 * return new ResponseEntity<>(grsTransactions, HttpStatus.OK); } }
 * 
 */