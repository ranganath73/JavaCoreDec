/**
 * Four public fields, corresponding to the four integer types, are declared in the Solution class.
 * When declared, these fields are initialized with various values stored in integer literals.
 *
 * But the program doesn't compile, and you need to fix it. 
 * To do this, make the fewest possible changes to the values of the fields 
 * so that the type of each variable matches the type of the integer literal.
 * 
 * You can only change the sign and type of each literal, not the digits or their order.
 *
 * Requirements:
 * •	Change the literal used to initialize the b field in accordance with the task conditions.
 * •	Change the literal used to initialize the s field in accordance with the task conditions.
 * •	Change the literal used to initialize the i field in accordance with the task conditions.
 * •	Change the literal used to initialize the l field in accordance with the task conditions.
 */

/* 
Integer literals
*/

public class Solution {
    public byte b = 128;
    public short s = 32768;
    public int i = 1_234_567_890L;
    public long l = 2_345_678_900;
}
