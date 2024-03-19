public class Eleven {
  public static void main(String[] args) {
    // 1. Get bit
    // Bit mask = (1 << i) and then perform AND operation
    // suppose to get 3rd bit of 0101 ... 0th bit starting from right to left.
    // 1 << 2 = 4(0100)
    // Now, 0100 AND 0101 => if it is non-zero, then get bit = 1, otherwise 0

    int n = 10; // 1010
    
    // For e.g getting 3rd bit
    int pos = 3;
    int bitMask = 1 << pos;
    if((bitMask & n) == 0){
      System.out.println("Bit is zero");
    }
    else{
      System.out.println("Bit is 1");
    }

    // 2. Set bit
    // Bit mask = (1 << i) and then perform OR operation
    // suppose to set 3rd bit of 0101 ... 
    // 1 << 3 = 8(1000)
    // Now, 1000 OR 0101 = 1101

    n = 5;
    pos = 3;
    bitMask = 1 << pos;
    System.out.println("Set bit : " + (bitMask | n));

    // 3. Clear bit -> make the bit 0
    // clear the 3rd bit, i.e: 0101 (5) => 0001 (1)
    // Not the bitmask, then AND with original no.

    n = 5;
    pos = 2;
    bitMask = 1 << pos;
    System.out.println("Clear bit : " + (~(bitMask) & n));

    // 4. Update bit - 0 to 1, and 1 to 0
    // If updation from 1 to 0 : It is same as clear operation
    // If updation from 0 to 1 : It is same as set operation
  }
}
