package pro.sky.Expenses.service;

import org.springframework.stereotype.Service;
import pro.sky.Expenses.model.Expense;
import pro.sky.Expenses.repository.ExpenseRepository;

import java.util.List;
@Service

public class ExpenseService {
    private ExpenseRepository expenseRepository;
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    public List<Expense> getAllExpense() {
        return expenseRepository.findAll();
    }
    public void createExpense(Expense expense) {
        expenseRepository.save(expense);

    }
    public void deleteExpense(Integer id) {
        expenseRepository.deleteById(id);
    }
}
