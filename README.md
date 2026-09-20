# Sirin 5D Waves

Minecraft Forge 1.20.1 / Java 17 project for geometric animated water waves.

## Included
- Dense triangle mesh with real vertex displacement.
- Four layered wave functions for rising/rolling surface motion.
- Client-side Forge render hook after translucent blocks.
- Nearby fluid-surface mesh generation around the player.
- ForgeGradle build configuration.
- GitHub Actions workflow that builds the JAR and uploads it as an artifact.

## Scope
The wave surface is implemented as geometry rather than a normal-map-only effect. Entity/boat lifting physics, fluid simulation, and replacing every vanilla water surface are separate systems and are not falsely marked complete.


## Build requirements
- Minecraft Forge 1.20.1 (47.x)
- Java Development Kit 17 (JDK 17)
- Gradle 8.x
- ForgeGradle 6.x
- Java source/target compatibility: 17

The repository includes separate Java configuration, wave-profile, surface-sampling and physics scaffolding classes so the renderer can be expanded without mixing rendering and simulation code.
