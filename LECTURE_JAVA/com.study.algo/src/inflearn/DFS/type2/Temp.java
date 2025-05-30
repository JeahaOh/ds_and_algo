package inflearn.DFS.type2;

import java.util.*;

public class Temp {
    private static List<String> dirList;

    private static void _mkdir(String route) {
        dirList.add(route);
    }

    private static void _cp(String from, String to) {
        String[] routes = from.split("/");
        int lastIdx = from.lastIndexOf(routes[routes.length - 1]);
        List<String> tempList = new ArrayList<String>();

        String newDir;
        for (String dir : dirList) {
            if (!dir.startsWith(from)) continue;

            newDir = to + "/" + dir.substring(lastIdx);
            newDir = newDir.replace("//", "/");

            tempList.add(newDir.trim());
        }

        dirList.addAll(tempList);
        tempList = null;
    }

    private static void _rm(String dest) {
        dirList.removeIf(item -> item.startsWith(dest));
    }

    private static void _exec(String line) {
        String[] inputs = line.split(" ");
        String cmd = inputs[0];

        switch (cmd) {
            case "mkdir" :
                _mkdir(inputs[1]);
                break;
            case "cp" :
                _cp(inputs[1], inputs[2]);
                break;
            case "rm" :
                _rm(inputs[1]);
                break;
            default :
        }
    }

    public static String[] solution(String[] directory, String[] command) {
        dirList = new ArrayList<String>(Arrays.asList(directory));

        for (String line : command) {
            _exec(line);
        }

        Set<String> set = new HashSet<>(dirList);
        dirList = new ArrayList<>(set);

        Collections.sort(dirList);
        return dirList.toArray(directory);
    }

    public static void main(String[] args) {
        String[] directory1 = {
                "/",
                "/hello",
                "/hello/tmp",
                "/root",
                "/root/abcd",
                "/root/abcd/etc",
                "/root/abcd/hello"
        };
        String[] command1 = {
                "mkdir /root/tmp",
                "cp /hello /root/tmp",
                "rm /hello"
        };
        /**
         * result
         * /
         * /root
         * /root/abcd
         * /root/abcd/etc
         * /root/abcd/hello
         * /root/tmp
         * /root/tmp/hello
         * /root/tmp/hello/tmp
         */
        for (String dir : solution(directory1, command1))
            System.out.println(dir);


        System.out.println("\n\n\n\n");

        String[] directory2 = {"/"};
        String[] command2 = {
                "mkdir /a",
                "mkdir /a/b",
                "mkdir /a/b/c",
                "cp /a/b /",
                "rm /a/b/c",
        };
        /**
         * result
         * /
         * /a
         * /a/b
         * /b
         * /b/c
         */
        for (String dir : solution(directory2, command2))
            System.out.println(dir);
    }
}
