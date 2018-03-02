package com.drools.project;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class RuleEngine {

  public static void main(String[] args) {

    System.out.println("Starting Rule Engine...");

    KieContainer kieContainer = KnowledgeSessionHelper.getRuleBase();
    KieSession kieStatefullSession = KnowledgeSessionHelper.getStatefulKnowledgeSession(
      kieContainer, "ksession-rules");

    OutputDisplay outputDisplay = new OutputDisplay();
    kieStatefullSession.setGlobal("outputDisplay", outputDisplay);

    Account account = new Account();
    kieStatefullSession.insert(account);
    kieStatefullSession.fireAllRules();

    System.out.println("Fired all rules.");
  }
}