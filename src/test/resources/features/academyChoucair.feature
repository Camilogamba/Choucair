@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Rose wants to learn automation at the Academy choucair
      | strUser    | strPassword   |
      | 1033776369 | Choucair2021* |
    When she search for the course on the choucair Academy platform
      | strCourse               |
      | Metodología Bancolombia |
    Then she finds the course called
      | strCourse               |
      | Metodología Bancolombia |