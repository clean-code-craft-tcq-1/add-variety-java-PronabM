# Check and Alert based on types

This exercise is based on the [BMS monitoring] domain.

Expand the checks and alerts to take care of a variety of types.

## Open for Extensions

How can you minimize the amount of work done to add a new type?
Can you add without modifying existing code?

## Assignment Approach

1. Firstly, segregated the base logic into separate classes considering their scope. 2 primary scopes were identified **Cooling and Alert** and sub-packages were created accordingly.
2. For both cooling and alert one `interface` was created so that any new cooling/alert system can implement the contract and one `enum` was created to track the different possibilities available.
3. Each element of the `enum` corresponds to an instance of the corresponding class and can be used via `getInstance()` method. The different classes have `protected` constructors restricting the instantiation outside of the package.
4. Lastly, `TypewiseAlert` class is used to expose all the static methods and thus instantiation of `TypewiseAlert` was restricted with a private constructor.
5. Additionally, one more breach type was added to handle the "Invalid Values". 