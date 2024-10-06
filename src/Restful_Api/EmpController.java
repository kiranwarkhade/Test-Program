package Restful_Api;


@RestController
@RequestMapping(" /employees")
public class EmpController {

	// private final EmployeeService EmployeeService;

	public EmpController() // EmployeeService EmployeeService
	{
		// this.EmployeeService=EmployeeService;

	}}

// EndPoints 1> all employee 2> get by Id

/*
 * @GetMapping public ResponseEntity<List> getAllEmployee() {
 * 
 * List<Employee> employees=employeeService.getAllEMployee();
 * 
 * return ResponseEntity.ok(employees); }
 * 
 * //
 * 
 * @GetMapping("{id}") public ResponseEntity<List>
 * getAEmployeeById(@PathVariable int id) {
 * 
 * Employee employee=employeeService.getEmployeeById(id);
 * 
 * if(employee != null) { return ResponseEntity.ok(employees); } else { return
 * ResponseEntity.notFound().build(); }
 * 
 * 
 * } }
 * 
 */

