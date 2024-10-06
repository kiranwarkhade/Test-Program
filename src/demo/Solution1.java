package demo;

import java.util.*;

public class Solution1 {
    private Map<String, Set<String>> movieToViewers = new HashMap<>();
    private Map<String, Set<String>> viewerToMovies = new HashMap<>();

    public void addViewerToMovie(String viewer, String movie) {
        Set<String> viewerMovies = viewerToMovies.get(viewer);
        if (viewerMovies == null) {
            viewerMovies = new HashSet<>();
            viewerToMovies.put(viewer, viewerMovies);
        }
        viewerMovies.add(movie);

        Set<String> movieViewers = movieToViewers.get(movie);
        if (movieViewers == null) {
            movieViewers = new HashSet<>();
            movieToViewers.put(movie, movieViewers);
        }
        movieViewers.add(viewer);
    }

    public List<String> getRelatedMovies(String movie) {
        Set<String> relatedMovies = new HashSet<>();
        Set<String> viewersOfGivenMovie = movieToViewers.get(movie);

        if (viewersOfGivenMovie != null) {
            for (String viewer : viewersOfGivenMovie) {
                relatedMovies.addAll(viewerToMovies.get(viewer));
            }
        }
        relatedMovies.remove(movie); // Remove the input movie itself
        return new ArrayList<>(relatedMovies);
    }
    public List<String> getRelatedMoviesWithDegree(String movie, int degree) {
        Set<String> relatedMovies = new HashSet<>();
        Set<String> visitedMovies = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(movie);
        visitedMovies.add(movie);

        while (!queue.isEmpty() && degree > 0) {
            int currentLevelSize = queue.size();
            for (int i = 0; i < currentLevelSize; i++) {
                String currentMovie = queue.poll();
                List<String> related = getRelatedMovies(currentMovie);
                for (String relatedMovie : related) {
                    if (!visitedMovies.contains(relatedMovie)) {
                        queue.add(relatedMovie);
                        visitedMovies.add(relatedMovie);
                        relatedMovies.add(relatedMovie);
                    }
                }
            }
            degree--;
        }

        relatedMovies.remove(movie); // Remove the input movie itself
        return new ArrayList<>(relatedMovies);
    }

    public static void main(String[] args) {
    	Solution1 graph = new Solution1();
        graph.addViewerToMovie("V1", "M1");
        graph.addViewerToMovie("V1", "M2");
        graph.addViewerToMovie("V2", "M2");
        graph.addViewerToMovie("V2", "M3");
        graph.addViewerToMovie("V3", "M1");
        graph.addViewerToMovie("V3", "M4");
   
        System.out.println("Part 1:");
        System.out.print(" get_related_movies(\"M4\") // ->");
        System.out.println(graph.getRelatedMovies("M4")); // -> [M1]
        System.out.print(" get_related_movies(\"M2\") // ->");
        System.out.println(graph.getRelatedMovies("M2")); // -> [M1, M3]
        System.out.println();
        System.out.println("Part 2:");
        System.out.print(" getRelatedMoviesWithDegree(\"M4\", 1)// -> ");		
        System.out.println(graph.getRelatedMoviesWithDegree("M4", 1)); // -> [M1]
        System.out.print(" getRelatedMoviesWithDegree(\"M4\", 2)// -> ");
        System.out.println(graph.getRelatedMoviesWithDegree("M4", 2)); // -> [M1, M2]
     }
}

	


