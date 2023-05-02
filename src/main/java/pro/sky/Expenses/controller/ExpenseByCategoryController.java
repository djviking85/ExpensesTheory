package pro.sky.Expenses.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Expenses.model.ExpenseByCategory;
import pro.sky.Expenses.service.ExpenseService;

import java.util.List;

@RestController
public class ExpenseByCategoryController {
    private final ExpenseService expenseService;

    public ExpenseByCategoryController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/espenses-by-categories")
    public List<ExpenseByCategory> getExpensesByCategories() {
        return expenseService.getExpensesByCategory();
    }
}
