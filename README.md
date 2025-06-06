# Final Project: Finch Robot Challenges

## Essential Question
How can we apply object-oriented programming principles and Java concepts to create interactive, autonomous robot behaviors that solve real-world challenges?

## Project Overview
In this project-based learning experience, you will program a Finch 2.0 robot to perform one of three challenges:
1. Choreograph a dance routine (with movement, lights, and sound)
2. Create an artistic drawing using the robot's movements
3. Navigate a maze autonomously

Your program must demonstrate your understanding of Java programming concepts from APCSA and object-oriented design principles while creating an engaging robot behavior.

## Learning Objectives
- Apply Java programming concepts in a physical computing context
- Implement object-oriented design principles
- Develop problem-solving skills through algorithm development
- Create well-documented and maintainable code
- Practice technical communication through presentations and documentation

## Description of design choices
We used the finch robot which already was it's own model, and our code is mainly using the sensors to navigate around the maze. It would go forward until it hit a certain ammount of cm ahead following the next command of making it turn. There was a part that didn't work, so we didn't use censors but to finish the maze, we used sensors. At the end there was a command that stops the finches movements and disconnects the robot.
## Challenges faced and solutions
During the maze challenge, there was a section where the sensors didn't work and it would constantly hit the wall and we didn't know what to do instead. We looked up the list of commands set and there was one that doesn't use sensors, but calculates the distance it moves forward. If you look at our code, most of them are while loops which heavily revolves around the sensors, but there is one part where it's just move forward and we measured the distance. We were able to get it to the perfect spot to finish up the maze!
## Future enhancements
In the future I think it would be cool for the robot to be able to move around the entire maze without the pre set commands because we made it turn right and left since we knew the layout but what if it didn't? I would try and make the robot map out the maze first by giving it commands to to turn around and once it finishes mapping it out, it goes back to the start. Then it will go from the beginning to the end with the shortest amount of time if it mapped it out correctly.
## Video or images of your robot in action (embedded or linked)
https://youtu.be/LphQJW4ppdQ?si=8xGIxzFdAbC16j7l
