public class Tile {
    
    int tileCord;
    
    Tile(int tileCord) {
        
    }
    
    public abstract boolean isTileOcc();
    
    public abstract Piece getPiece();
    
    public static final class EmptyTile extends Tile {
        
        EmptyTile(int coordinate) {
            super(coordinate);
        }
        
        @Override
        public boolean isTileOccupied() {
            return false;
        }
        
        @Override
        public Piece getPiece() {
            return null;
        }
        
        public static final calss OccupiedTile extends Tile () {
            
            Piece pieceOnTile();
            
            occupiedTile(int tielCoordinate, Piece pieceOnTile) {
            super(tileCoordinate);
            
            this.pieceOnTile = pieceOnTile;
            
            @Override
            public boolean isTileOccupied() {
                return true
            }
            
            @Override
            public Piece getPiece() {
                return this.pieceOnTile();
            }
        }
            
        }
    }
}
