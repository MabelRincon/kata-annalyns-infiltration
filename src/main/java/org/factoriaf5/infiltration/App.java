package org.factoriaf5.infiltration;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        System.out.println("Annalyn's Infiltration Test Cases:");

        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisonerIsAwake = true;
        boolean petDogIsPresent = true;
        boolean canFastAttack = AnnalynsInfiltration.canFastAttack(knightIsAwake);
        boolean canSpy = AnnalynsInfiltration.canSpy(knightIsAwake, archerIsAwake, prisonerIsAwake);
        boolean canSignalPrisoner = AnnalynsInfiltration.canSignalPrisoner(archerIsAwake, prisonerIsAwake);
        boolean canFreePrisoner = AnnalynsInfiltration.canFreePrisoner(knightIsAwake, archerIsAwake, prisonerIsAwake, petDogIsPresent);
        System.out.println("Can Fast-Attack? " + canFastAttack);
        System.out.println("Can Spy? " + canSpy);
        System.out.println("Can Signal Prisoners? " + canSignalPrisoner);
        System.out.println("Can Free Prisoners? " + canFreePrisoner);
    }
}
