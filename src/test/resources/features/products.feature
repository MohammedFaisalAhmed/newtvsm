@Products
Feature: Products Drop Down Menu Functionality

@ProductMenu
Scenario Outline: Users selects a vehicle from product menu from on Website.
Given: User clicks on products drop down.
When: User selects any "<VehicleModel>"
Then: All the "<VehicleModel>" are dispalyed
And: User selects a "<Vehicle>"
Then: User navigates to specific "<SelectedVehicle>" Page.

Example:
|VehicleModel|Vehicle|SelectedVehicle|
|Motorcycles |
