package ru.geekbrains.hw1;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static int mapHeight = 5;
    public static int mapWidth = 5;
    public static char[][] map = new char[mapHeight][mapWidth];
    public static char heroChar = '@', aiChar = 'E', emptyChar = '_', coinChar = '$';
    public static int heroHealth = 100;
    public static int heroPower;
    public static int heroValueMin = 20;
    public static int heroValueMax = 40;
    public static int heroCoins = 0;
    public static int heroExp = 0;
    public static int heroPosX;
    public static int heroPosY;
    public static int aiHealth;
    public static int aiPower;
    public static int aiCount;
    public static int aiValueMin = 20;
    public static int aiValueMax = 40;
    public static int countCoins;
    public static final int heroMoveUp = 8;
    public static final int heroMoveDown = 2;
    public static final int heroMoveLeft = 4;
    public static final int heroMoveRight = 6;

    public static void main(String[] args) {
        createMap();
        createHero();
        spawnCoins();
        spawnAi();

        while (true) {
            printMap();
            heroMoveAction();

            if (!isHeroAlive()) {
                System.out.println("Hero dead. Game over. Hero Score " + heroCoins);
                break;
            }
            if (!isCoinsExist()){
                System.out.println("Hero Win. Hero Score " + heroCoins + ". Level finish");
                createMap();
                createHero();
                spawnCoins();
                spawnAi();
            }

            if (!isAiExist()) {
                System.out.println("Hero Win. Hero Score " + heroCoins + ". Level finish");
                createMap();
                createHero();
                spawnCoins();
                spawnAi();
            }
        }
        printMap();
        System.out.println("Game over!");
    }
    public static void createMap() { //создаем пустое поле
        for (int i = 0; i < mapWidth; i++) {
            for (int j = 0; j < mapHeight; j++) {
                map[i][j] = emptyChar;
            }
        }
        System.out.println("Map has been created.");
    }

    public static void printMap() { // создаем отображение поля, скрывая все сущности на карте от игрока, кроме Hero
        System.out.println("MAP");
        for(int i = 0; i < mapWidth; i++){
            for(int j = 0;j < mapHeight; j++){
                if (map[i][j] == 'E'){
                    System.out.print("_" + "|");
                } else if (map[i][j] == '$'){
                    System.out.print("_" + "|");
                }
                else{
                    System.out.print(map[i][j] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static int randomValue(int min, int max){
        return min + random.nextInt(max - min + 1);
    }

    public static void createHero() {
        heroPosX = randomValue(0, mapWidth - 1);
        heroPosY = randomValue(0, mapHeight - 1);
        heroPower = randomValue(heroValueMin, heroValueMax);
        map[heroPosY][heroPosX] = heroChar;
        System.out.println("Hero has been created in [" + (heroPosX + 1) + ":" + (heroPosY + 1) + "]");
        System.out.println("Hero Health=" + heroHealth);
    }

    public static void spawnCoins(){

        int coinsPosX;
        int coinsPosY;

        countCoins = (mapWidth + mapHeight) / 2;

        for (int i = 1; i <= countCoins; i++) {
            do {
                coinsPosX = random.nextInt(mapWidth);
                coinsPosY = random.nextInt(mapHeight);
            } while (!isEmpty(coinsPosX, coinsPosY));
            map[coinsPosX][coinsPosY] = coinChar;
        }
    }

    public static void spawnAi(){
        aiHealth = randomValue(aiValueMin, aiValueMax);
        aiPower = randomValue(aiValueMin, aiValueMax);
        aiCount = (mapWidth + mapHeight) / 2;

        int aiPosX;
        int aiPosY;

        for (int i = 1; i <= aiCount; i++) {

            do {
                aiPosX = random.nextInt(mapWidth);
                aiPosY = random.nextInt(mapHeight);
            } while (!isEmpty(aiPosX, aiPosY));
            map[aiPosX][aiPosY] = aiChar;
        }
    }

    public static void heroMoveAction() {
        int heroLastPositionX = heroPosX;
        int heroLastPositionY = heroPosY;

        int heroMove;

        do {
            System.out.print("Enter destination: (UP-" + heroMoveUp + "|DOWN-" + heroMoveDown +
                    "|LEFT-" + heroMoveLeft + "|RIGHT-" + heroMoveRight + ") > ");
            heroMove = scanner.nextInt();

            switch (heroMove) {
                case heroMoveUp:
                    heroPosX -= 1;
                    break;
                case heroMoveDown:
                    heroPosX += 1;
                    break;
                case heroMoveLeft:
                    heroPosY -= 1;
                    break;
                case heroMoveRight:
                    heroPosY += 1;
                    break;
            }

        } while (!isValidHeroTurn(heroLastPositionX, heroLastPositionY, heroPosX, heroPosY));

        heroNextCellAction();

        map[heroPosX][heroPosY] = heroChar;
        map[heroLastPositionX][heroLastPositionY] = emptyChar;
    }

    public static boolean isValidHeroTurn(int lastX, int lastY, int nextX, int nextY) {
        if (isCellValid(nextX, nextY)) {
            System.out.println("Hero has move to [" + nextX + ":" + nextY + "]");
            return true;
        } else {
            System.out.println("Hero move to [" + nextX + ":" + nextY + "] invalid");
            heroPosX = lastX;
            heroPosY = lastY;
            return false;
        }
    }

    public static void heroNextCellAction() {
        if (map[heroPosX][heroPosY] == aiChar) {
            aiCount--;
            heroExp += 100;
            System.out.println("Hero fight with Enemy!"); // В консоль выводить логи самой битвы;
            System.out.println("Hero power = " + heroPower);
            System.out.println("Enemy power = " + aiPower);
            if (heroPower < aiPower){
                heroHealth -= aiPower;
                System.out.println("Hero get damage " + aiPower + ". Hero health "  + heroHealth);
            }
            if (heroHealth > 0) {
                System.out.println("Hero Win! ");
            }

        }
        if (map[heroPosX][heroPosY] == coinChar) {
            int count = randomValue(10, 100);
            heroCoins += count;
            System.out.println("Hero get " + count + " coins.");
        }
    }

    public static boolean isEmpty(int x, int y) {
        return map[x][y] == emptyChar;
    }

    public static boolean isCellValid(int x, int y) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

    public static boolean isHeroAlive() {
        return heroHealth > 0;
    }

    public static boolean isAiExist() {
        return aiCount > 0;
    }
    public static boolean isCoinsExist() {
        return countCoins > 0;
    }
}

