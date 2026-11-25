Feature: Validate insurance project

  Scenario: To validate Enter Vehicle Data module
    Given Launch Tricentis Vehicle Insurance Application
    When Click on Automobile link
    When I will enter following data for this step
      | BMW | 1000 | 11/24/2026 | 4 | Petrol | 10000 | MH09DL0234 | 1000 |
		#this format is called as DataTable
