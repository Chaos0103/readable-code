package cleancode.minesweeper.tobe;

import cleancode.minesweeper.tobe.mineswepper.Minesweeper;
import cleancode.minesweeper.tobe.mineswepper.config.GameConfig;
import cleancode.minesweeper.tobe.mineswepper.gamelevel.Beginner;
import cleancode.minesweeper.tobe.mineswepper.io.ConsoleInputHandler;
import cleancode.minesweeper.tobe.mineswepper.io.ConsoleOutputHandler;

public class GameApplication {

    public static void main(String[] args) {
        GameConfig gameConfig = new GameConfig(
            new Beginner(),
            new ConsoleInputHandler(),
            new ConsoleOutputHandler()
        );

        Minesweeper minesweeper = new Minesweeper(gameConfig);
        minesweeper.initialize();
        minesweeper.run();
    }

    /**
     * DIP (Dependency Inversion Principle)
     *
     * DI (Dependency Injection) - "3"
     *
     * IoC (Inversion of Control)
     */
}
