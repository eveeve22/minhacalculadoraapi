package dio.minhacalculadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    
    @Autowired
    private CalculadoraRepository calculadoraRepository;

    public Calculadora performCalculation(double num1, double num2, String operator) {
        double result = 0;
        switch (operator) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                result = num1 / num2;
                break;
        }

        Calculadora calculo = new Calculadora();
        calculo.setNum1(num1);
        calculo.setNum2(num2);
        calculo.setOperator(operator);
        calculo.setResult(result);
        calculo.save(calculo);
        return calculo;
    }
}


