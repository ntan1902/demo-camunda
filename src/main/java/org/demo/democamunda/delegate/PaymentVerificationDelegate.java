package org.demo.democamunda.delegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PaymentVerificationDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Simulate payment verification
        boolean paymentVerified = Math.random() < 0.8; // 80% chance of success
        execution.setVariable("paymentVerified", paymentVerified);
        System.out.println("Payment verification result: " + paymentVerified);
    }
}