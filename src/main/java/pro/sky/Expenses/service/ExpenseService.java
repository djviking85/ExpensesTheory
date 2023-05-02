package pro.sky.Expenses.service;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import pro.sky.Expenses.model.Expense;
import pro.sky.Expenses.model.ExpenseByCategory;
import pro.sky.Expenses.repository.ExpenseRepository;

import java.util.List;
@Service

public class ExpenseService {
    private ExpenseRepository expenseRepository;
    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
    public List<Expense> getAllExpense(Integer pageNumber, Integer pageSize) {
        PageRequest pageRequest = PageRequest.of(pageNumber - 1, pageSize);
        return expenseRepository.findAll(pageRequest).getContent();
    }
    public void createExpense(Expense expense) {
        expenseRepository.save(expense);

    }
    public void deleteExpense(Integer id) {
        expenseRepository.deleteById(id);
    }
    public List<ExpenseByCategory> getExpensesByCategory() {
        return expenseRepository.getExpenseByCategory();
    }
}
