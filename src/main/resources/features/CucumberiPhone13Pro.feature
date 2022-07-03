
Feature: Cucumber iPhone13 Pro

  @smoke
  Scenario: Apple iPhone13 Pro cucumber scenario
    Given user enters the site "apple.com"
    When  user clicks on the header of the upper "iPhone" bar
    Then  user should see Oh. So. Pro."
    When  user clicks on buy"
    Then  user should see Buy iPhone 13 Pro"
    Then  user sees the inscription at the bottom Choose your model.
    And   user clicks on iPhone 13 Pro 6.1-inch display¹"
    Then  user sees the inscription at the bottom Choose your finish.
    And   user clicks on Alpine Green
    Then  user sees the inscription at the bottom Choose your capacity.
    And   user clicks on 1TB²
    Then  user sees the inscription at the bottom Connect to a carrier now.
    And   user clicks on Connect on your own later.
    Then  user sees the inscription at the bottom Do you have a smartphone to trade in with Apple?
    And   user clicks on No
    Then  user sees the inscription at the bottom Choose a payment option.
    And   user clicks on One-time payment
    Then  user sees the inscription at the bottom Would you like to add AppleCare+ coverage?
    And   user clicks on AppleCare+with Theft and Loss
    And   user selects below on "two years of coverage
    Then  user sees the price
    And   user clicks on Apple Bellevue Square in the section Order now. Pick up, in store:
    Then  user sees the iPhone Availability
    And   user scroll down the page to Continue
    And   user clicks on Continue

#    This scenario describes how the
  #    user makes a purchase, all test
    #    cases are written strictly in turn
      #    and are not subject to verification.
        #    In this case, all the ways are
          #    written from the entrance to the
            #    site to the purchase of the product.
              #    These test cases were written by the
                #    tester Kasymbaev Temirlan

#    And   user selects below on Add to bag
#    Then  user sees the inscription at the bottom iPhone 13 Pro 1TB Alpine Green One-time payment
#    And   ser clicks on the button on the right Review Bag
#
#
#
#    Then  user at the bottom chooses a color
#    Then  user at the bottom chooses a Choose your capacity.
#
#
#    Then  user should see Select your new MacBook Pro
#    And   user should choose 13-inch
#    When  user scrolls down to the Mac with the characteristic "8-core processor 10-core processor 8 GB of unified memory 512 GB SSD drive 1" and click "select"
#    And   user should see "Customize Your 13‑inch MacBook Pro - Space Gray".
#    Then  user scrolls the page down to the Memory label
#    When  user clicks on the 24GB unified memory button
#    Then  user should see Storage
#    When  user clicks on the 2TB SSD storage
#    Then  user should see Keyboard Language
#    And   user selects the language for the keyboard  US English
#    Then  user should see Pre-Installed Software
#    And   user clicks on Final Cut Pro
#    Then  user should see Logic Pro
#    And   user clicks on Logic Pro at the bottom
#    And   user clicks on the Add to Bag button
#    Then  user should see "All the essentials. And then some."
#    When  user sees a "Review bag" it is necessary to click on it
#    Then  user will see  "Review your bag."
#    When  user scrolls down the page to "How would you like to check out?"
#    Then  user the "Pay in full" section
#    And   user clicks on "check out"
#    Then  user will see "Log in for faster checkout."
#    And   user has to find and click on "Continue as Guest"
#    Then  user will see "How would you like to get your order?"
#    When  user needs to select "I’d like it delivered"
#    And   user needs to scroll down the page and click on "Continue to Shipping Address"
#    Then  user will see "Where should we send your order?"
#    And   First name, Last name,Street Address,Zip Code,City,State,Email Address and Phon Number input fields should appear
#    And   enter in First name      Temirlan
#    And   enter in Last name       Kasymbaev
#    And   enter in Street Address  10-microdistrict
#    And   enter in Zip Code        11324-1525
#    And   enter in City            Bishkek
#    And   enter in State           99
#    And   enter in Email Address   timakas3145@gmail.com
#    And   enter in Phone Number    +996 704 572 748
#    Then  user should click on "Continue to Payment"
