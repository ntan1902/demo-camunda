package org.demo.democamunda.delegate;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class InventoryCheckDelegate implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Simulate inventory check
        boolean itemsAvailable = Math.random() < 0.9; // 90% chance of items being available
        execution.setVariable("itemsAvailable", itemsAvailable);
        System.out.println("Inventory check result: " + itemsAvailable);
    }
}