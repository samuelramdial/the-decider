# The Decider 
**The Decider** is a Java console application that helps two users settle a decision between two options using randomness. This project was developed for **ITSC 1212 - Introduction to Computer Science II** at the **University of North Carolina at Charlotte**. 
## Project Description 
This application simulates a lightweight decision-making tool for two users. Given an option, the program selects a "winner" using Java's built-in `Math.random()` method and announces the result. It keeps running until both users choose to stop by entering `"end"`.
### User Flow 
1. Program prompts for:
   - The option to be decided
   - The names of both users
2. A random number is generated:
   - If `< 0.5', user 1 wins
   - Otherwise, user 2 wins
3. Both users are asked if they want to decide another option
4. The program continues until **both** users enter `"end"` (case-insensitive).
## Acknowledgments 
Project developed for: 
- **ITSC 1212 - Introduction to Computer Science I**
- Intstructor: D.I. Von Briesen
- University of North Carolina at Charlotte
© 2025 Samuel Ramdial
