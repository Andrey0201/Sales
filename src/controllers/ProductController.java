package controllers;

import models.Product;
import views.SalesView;
import utils.Rounder;
//мроо
public class ProductController {
    Product model;
    SalesView view;

    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();


        String name = model.getName();

        double profit = model.getProfit(model.getQuantity(), model.getPrice());
        double tax = model.tax(profit, model.TAX_RATE);
        double freeProfit = model.getProfit(profit, tax);

        String strProfit = Rounder.rounding(profit);
        String strTax = Rounder.rounding(tax);
        String strFreeProfit = Rounder.rounding(freeProfit);


        String output = "Наименование товара: " + name +
                "\nОбщий доход (грн.): " + strProfit +
                "\nСумма налога (грн.): " + strTax +
                "\nЧистый доход (грн.): " + strFreeProfit;

        view.getOutput(output);
    }
}