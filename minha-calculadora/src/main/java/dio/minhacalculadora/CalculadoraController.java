
@RestController
@RequestMapping("/api/calculator")
public class CalculadoraController {
    @Autowired
    private CalculadoraService calculatorService;

    @PostMapping("/calculate")
    public Calculadora calculate(@RequestParam double num1, @RequestParam double num2, @RequestParam String operator) {
        return calculadoraService.performCalculation(num1, num2, operator);
    }
}
