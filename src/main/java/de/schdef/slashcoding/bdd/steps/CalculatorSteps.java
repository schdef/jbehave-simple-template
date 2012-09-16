package de.schdef.slashcoding.bdd.steps;

import junit.framework.Assert;

import org.jbehave.core.annotations.Alias;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

public class CalculatorSteps {

    Calculator _calculator;
    int result;
    
    @Given("Ich habe einen Taschenrechner")
    @Alias("ist ein Taschenrechner")
    public void givenIchHabeEinenTaschenrechner() {
      _calculator = new Calculator();
    }
    
    @When("ich $a und $b eingebe und auf Addieren dr\u00FCcke")
    @Alias("ich $a und $b eingebe und auf Addieren druecke")
    public void sumTwoNumbers(int a, int b) {
      result = _calculator.add(a, b);
    }

    @Then("wird die Summe $ergebnis angezeigt")
    public void thenWirdDieSumme90WirdAngezeigt(int ergebnis) {
      Assert.assertEquals(ergebnis, result);
    }
}
