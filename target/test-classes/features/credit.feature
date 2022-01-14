@runAll
Feature: Calculate Bank Credit


    Scenario Outline: Calculate Residence Credit

      Given Go to adress
      And Wait "5" seconds
      And Hover on "<menuName>" at "navigationBar"
      And Wait "2" seconds
      And Click "<credits>" from "subListNavigationBar"
      And Wait "2" seconds
      And Check "<credits>" with "titleOfCreditPages"
      And Wait "2" seconds
      And Scroll on "<creditTitle>" at "divTitlesOfCreditPage"
      And Wait "2" seconds
      And Click "<creditType>" from "subListsOFTitles"
      And Wait "2" seconds
      And Check "<creditType>" with "titleOfCreditPages"
      And Wait "2" seconds
      And Scroll on "calculatorTitle"
      And Wait "2" seconds
      And Click on "dropDownListOfTheCreditType"
      And Wait "2" seconds
      And Click "<scheduleOfCredits>" from "dropDownList"
      And Wait "2" seconds
      And Send "<amount>" to "amountTextBox"
      And Wait "2" seconds
      And Send "<expiry>" to "expiryTextBox"
      And Wait "2" seconds
      And Send "<interest>" to "interestTextBox"
      And Wait "2" seconds
      And Click on "calculateButton"
      And Wait "2" seconds
      And Check "<expectedIA>" with "installmentAmountText"
      And Check "<expectedIR>" with "interestRateText"
      And Check "<expectedACR>" with "annualCostRateText"
      And Wait "2" seconds

      Examples:

        | menuName | credits  | creditTitle         | creditType       | scheduleOfCredits                       | amount  | expiry | interest | expectedIA   | expectedIR | expectedACR |
        | Bireysel | Krediler | Konut / Gayrimenkul | Konut Kredisi    | Konut Ürün Paketi                       | 1000000 | 48     | 2        | 32.601,84 TL | % 2,00     | % 27.3007   |
        | Bireysel | Krediler | Genel İhtiyaçlar    | Tüketici Kredisi | Tüketici Kredisi ( 50.001 TL Ve Üzeri ) | 70000   | 24     | 1,69     | 3.712,73 TL  | % 1,69     | % 27.9415   |
        | Bireysel | Krediler | Taşıt               | Taşıt Kredisi    | Taşıt Kredisi (kaskolu)                 | 80000   | 32     | 3        | 4.250,73 TL  | % 3,00     | % 53.5834   |
        | Bireysel | Krediler | Konut / Gayrimenkul | Konut Kredisi    | Sıfır Konut Kredisi                     | 450000  | 60     | 1,5      | 11.427,04 TL | % 1,50     | % 20.0183   |


