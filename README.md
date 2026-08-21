# GamerPoint Player Count

Velocity 4.1.x source project.

Hides the player count in the Minecraft server list by using Velocity's
ServerPing.Builder.nullPlayers().

## Build
Requirements:
- Java 21+
- Maven
- Internet access to the PaperMC Maven repository

Run:
mvn clean package

The compiled JAR will be in target/.

## Install
Copy the generated JAR to your Velocity plugins/ folder.
Remove older GamerPoint/FakePlayerCount versions first.
Restart Velocity.

The server list should show ??? instead of the real player count.
