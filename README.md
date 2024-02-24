# FRC-2024-Everybot
 Code for the 2024 Everybot/Kitbot.

# Code Setup

`/src` - Robot code.

`/deploy` - Used to store files on the roborio.
    `/modules` - Used to store the yagsl configurations.
    `/pathplanner` - Stores path data for pathplanner.
    `/swervedrive.json` Used to store the yagsl configuration.

`/java/frc/robot` - Stores the main robot code.
    `/commands` - Stores the commands for the robot.
        `/intake` - Stores commands for intake.
        `/drive` - Stores commands for swerve drive.
        `/lights` - STores commands for LED lights.

`/subsystems` - Stores the subsystem code.

`Constants.java` - Stores all of our constant values.

`Main.java` - Starts the robot (do not change).

`Robot.java`- Executes from main. Don't mess around with this, use robot container.

`RobotContainer.java` - Where most of the robot code will initialize from.

`/vendordeps` - Robot packages.
