import os


def extract_movie_titles(input_file, output_file):
    try:
        # Get absolute paths
        current_dir = os.path.dirname(os.path.abspath(__file__))
        input_path = os.path.join(current_dir, input_file)
        output_path = os.path.join(current_dir, output_file)
        
        with open(input_path, 'r', encoding='utf-8') as f:
            lines = f.readlines()
        
        # Extract movie titles using list comprehension
        movies = [line.split(',', 1)[1].strip() for line in lines if ',' in line]
        
        # Write formatted movies to output file
        with open(output_path, 'w', encoding='utf-8') as f:
            for movie in movies:
                # Remove year and parentheses at the end
                movie = movie.split('(')[0].strip()
                f.write(f"{movie}\n")
                
        print(f"Success! Output saved to {output_path}")
                
    except FileNotFoundError:
        print(f"Error: Could not find input file '{input_file}'")
        print(current_dir)
    except Exception as e:
        print(f"An error occurred: {e}")


if __name__ == "__main__":
    input_file = "filmliste.txt"
    output_file = "formatted_movies.txt"
    extract_movie_titles(input_file, output_file)