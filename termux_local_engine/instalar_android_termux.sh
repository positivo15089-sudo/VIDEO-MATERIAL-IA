#!/data/data/com.termux/files/usr/bin/bash
set -e
echo "================================================================="
echo "  VÍDEO MATERIAL IA — MOTOR PYTHON + FFMPEG NATIVO NO ANDROID"
echo "================================================================="
pkg update -y
pkg install -y python ffmpeg libjpeg-turbo libpng opencv-python numpy
pip install pillow
echo "Ambiente Android ARM64 configurado com sucesso!"
echo "Executando renderizador local de propaganda em MP4..."
python3 local_video_engine.py
